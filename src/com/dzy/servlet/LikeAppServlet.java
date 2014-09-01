package com.dzy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.dzy.service.imp.AppService;
import com.dzy.service.interfac.AppServiceInterface;

public class LikeAppServlet extends HttpServlet {

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
			response.setContentType("text/html");
			String id=request.getParameter("id");
		//	System.out.println("id是"+id);
			String hql="update App  set appLike=appLike+1 where id=?";
			WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
			//从spring容器中，取出了 AppServiceInter 类型的bean
			AppServiceInterface appService=(AppServiceInterface) ctx.getBean("appService");
			appService.PartupdateByHql(hql, new Object[]{Integer.parseInt(id)});
			
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	}

}
