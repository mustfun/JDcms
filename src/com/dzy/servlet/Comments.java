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

		//响应客户端的类型，编码，就是发送到客户端的类型
		response.setContentType("text/xml;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out=response.getWriter(); //用out去输出到页面上，哈哈
		request.setCharacterEncoding("utf-8");
		String text1=request.getParameter("textvalue");
		String text=new String(text1.getBytes("iso-8859-1"),"utf-8"); //终于乱码解决
	//	System.out.println("评论的内容是"+text);
		Integer id=Integer.parseInt(request.getParameter("appid"));
		Integer[] appid={id};
		//System.out.println(text);
		//思考需要到数据库中去取出评论，麻烦
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		//从spring容器中，取出了 AppServiceInter 类型的bean
		AppServiceInterface appService=(AppServiceInterface) ctx.getBean("appService");
		
		//先把这条保存一下，
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
		//很好，已经得到了最后几条数据
		//然后封装到xml文件中就可以了
//		for(Appcomment app: commentlist)
//		{
//			System.out.println(app.getContents());
//		}
		String responsetext="<allComments>";
		for(int i=0;i<commentlist.size();i++)
		{
			Appcomment ac=commentlist.get(i);
			//原来在这里好像根本就打印不出来吧
			responsetext+="<comments><name>"+ac.getUsers().getName()+"</name><content><![CDATA["+ ac.getContents()+"]]></content></comments>";
		}
		responsetext+="</allComments>";
	//	System.out.println("拼接的xml是这样的"+responsetext);
		//上面就是存储了一个xml
		out.write(responsetext);
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
