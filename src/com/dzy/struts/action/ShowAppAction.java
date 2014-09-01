/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.dzy.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.dzy.domain.App;
import com.dzy.domain.Appcomment;
import com.dzy.service.interfac.ShowAppServiceInterface;

/** 
 * MyEclipse Struts
 * Creation date: 03-18-2014
 * 
 * XDoclet definition:
 * @struts.action parameter="flag"
 */
public class ShowAppAction extends DispatchAction {
	
	ShowAppServiceInterface showAppService=null;
	public void setShowAppService(ShowAppServiceInterface showAppService) {
		this.showAppService = showAppService;
	}
	public ActionForward showmain(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		List<App> list=showAppService.showFirstPageApp(1, 12);
		request.setAttribute("appinfo",list);
//		for(int i=0;i<list.size();i++)
//		{
//			
//			App a=list.get(i);
//			System.out.println("��ʵ��Ҳ����֪��Ϊʲô"+a.getAppName());
//		}
		return mapping.findForward("showmain");
	}
	//����չʾapp�ĵط�
	public ActionForward showapp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		String id=request.getParameter("id");
		//System.out.println("id�Ĵ�С��"+id);
		App a=(App) showAppService.findById(App.class, Integer.parseInt(id));
		request.setAttribute("appinfomation", a);
		//������Ҳ������
		
		String hql="from Appcomment where app.id=? order by id desc ";
		List<Appcomment> commentlist=showAppService.executeLastPage(hql,new Object[]{Integer.parseInt(id)},3);
		//System.out.println(commentlist.size());
		
		//���滹Ҫ����������Ӧ�ö�����
		List<App> list3=showAppService.showMostDownload();
		request.setAttribute("mostdownload", list3);
		
		request.setAttribute("commentinfo", commentlist);
		return mapping.findForward("showappinfo");
	}
	
	
	public ActionForward aboutwebsite(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		return mapping.findForward("gotoaboutwebsite");
	}
	
}