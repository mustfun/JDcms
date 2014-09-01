package com.dzy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.dzy.domain.App;
import com.dzy.domain.Appcomment;
import com.dzy.domain.Users;
import com.dzy.service.interfac.AppServiceInterface;

public class Comments extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//��Ӧ�ͻ��˵����ͣ����룬���Ƿ��͵��ͻ��˵�����
		response.setContentType("text/xml;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out=response.getWriter(); //��outȥ�����ҳ���ϣ�����
		request.setCharacterEncoding("utf-8");
		String text1=request.getParameter("textvalue");
		String text=new String(text1.getBytes("iso-8859-1"),"utf-8"); //����������
	//	System.out.println("���۵�������"+text);
		Integer id=Integer.parseInt(request.getParameter("appid"));
		Integer[] appid={id};
		//System.out.println(text);
		//˼����Ҫ�����ݿ���ȥȡ�����ۣ��鷳
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		//��spring�����У�ȡ���� AppServiceInter ���͵�bean
		AppServiceInterface appService=(AppServiceInterface) ctx.getBean("appService");
		
		//�Ȱ���������һ�£�
		Appcomment ac1=new Appcomment();
		Users user=(Users) request.getSession().getAttribute("loginuser");
		ac1.setContents(text);
		ac1.setUsers(user);
		ac1.setApp((App)appService.findById(App.class, id));
		if(user!=null)
		{
			appService.add(ac1);
		}
		String hql="from Appcomment where app.id=? order by id desc";
		List<Appcomment> commentlist=appService.executeLastPage(hql, appid,3);
		//�ܺã��Ѿ��õ������������
		//Ȼ���װ��xml�ļ��оͿ�����
//		for(Appcomment app: commentlist)
//		{
//			System.out.println(app.getContents());
//		}
		String responsetext="<allComments>";
		for(int i=0;i<commentlist.size();i++)
		{
			Appcomment ac=commentlist.get(i);
			//ԭ���������������ʹ�ӡ��������
			responsetext+="<comments><name>"+ac.getUsers().getName()+"</name><content><![CDATA["+ ac.getContents()+"]]></content></comments>";
		}
		responsetext+="</allComments>";
	//	System.out.println("ƴ�ӵ�xml��������"+responsetext);
		//������Ǵ洢��һ��xml
		out.write(responsetext);
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
