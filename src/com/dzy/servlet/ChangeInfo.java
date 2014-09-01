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

import com.dzy.domain.University;
import com.dzy.service.interfac.UniversityServiceInterface;

public class ChangeInfo extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//这个servlet是用来响应用户点击不同的省市的servlet的
		//也可以做成一个action
		resp.setContentType("text/xml;charset=utf-8");
		resp.setHeader("Cache-Control", "no-cache");
		PrintWriter out = resp.getWriter();
		System.out.println("你到底到这里来了额米有");
		String proid=req.getParameter("proid");
		
		//获取spring容器
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		//从spring容器中，取出了 UniversityServiceInter 类型的bean
		UniversityServiceInterface universityService=(UniversityServiceInterface) ctx.getBean("universityService");
		List<University> uniList=universityService.ShowUniversity(new Object[]{Integer.parseInt(proid)});
        String res = "<allUniversities>";
		
		for (int i = 0; i < uniList.size(); i++) {
			University u = uniList.get(i);
			res += "<unis><id>" + u.getId() + "</id><name><![CDATA["
					+ u.getName() + "]]></name></unis>";
		}
		res += "</allUniversities>";
		//因为ajax可以对xml文件进行操作，所以，上面的就是把所有的数据写成一个xml，然后用unis作为一个标签拼接起来，
		//然后可以在ajax那边进行获取
		out.write(res);
		out.close();
		
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
