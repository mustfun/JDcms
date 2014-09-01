package com.dzy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.dzy.domain.App;
import com.dzy.domain.Userdownapp;
import com.dzy.domain.Users;
import com.dzy.service.imp.AppService;
import com.dzy.service.interfac.AppServiceInterface;

public class AddAppDownNum extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//System.out.println("让我知道你到这里来了ok");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int appid=Integer.parseInt(request.getParameter("id"));
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		//从spring容器中，取出了 AppServiceInter 类型的bean
		AppServiceInterface appService=(AppServiceInterface) ctx.getBean("appService");
		App app=(App) appService.findById(App.class, appid);
		Users user=(Users) request.getSession().getAttribute("loginuser");
		Userdownapp uda=new Userdownapp();
		uda.setApp(app);
		uda.setUsers(user);
		if(user!=null)
			{
				appService.add(uda);
			}
		//System.out.println("添加完毕");
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
