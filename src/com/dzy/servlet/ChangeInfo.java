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
		//���servlet��������Ӧ�û������ͬ��ʡ�е�servlet��
		//Ҳ��������һ��action
		resp.setContentType("text/xml;charset=utf-8");
		resp.setHeader("Cache-Control", "no-cache");
		PrintWriter out = resp.getWriter();
		System.out.println("�㵽�׵��������˶�����");
		String proid=req.getParameter("proid");
		
		//��ȡspring����
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		//��spring�����У�ȡ���� UniversityServiceInter ���͵�bean
		UniversityServiceInterface universityService=(UniversityServiceInterface) ctx.getBean("universityService");
		List<University> uniList=universityService.ShowUniversity(new Object[]{Integer.parseInt(proid)});
        String res = "<allUniversities>";
		
		for (int i = 0; i < uniList.size(); i++) {
			University u = uniList.get(i);
			res += "<unis><id>" + u.getId() + "</id><name><![CDATA["
					+ u.getName() + "]]></name></unis>";
		}
		res += "</allUniversities>";
		//��Ϊajax���Զ�xml�ļ����в��������ԣ�����ľ��ǰ����е�����д��һ��xml��Ȼ����unis��Ϊһ����ǩƴ��������
		//Ȼ�������ajax�Ǳ߽��л�ȡ
		out.write(res);
		out.close();
		
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
