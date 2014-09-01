package com.dzy.service.imp;

import java.util.List;

import com.dzy.basic.BasicService;
import com.dzy.domain.Admin;
import com.dzy.service.interfac.AdminServiceInterface;

public class AdminService extends BasicService implements AdminServiceInterface {

	public Admin checkAdmin(Admin admin)
	{
		String hql="from Admin where username=? and pwd=?";
		Object parameters[]={admin.getUsername(),admin.getPwd()};
		admin=(Admin) this.executeQuery(hql, parameters);
		return admin;
	}
	
	//取出所有的App
	public List admin_getAllApp(int pageNow)
	{
		String hql="from App";
		List list=this.executeByPage(pageNow,4, null, hql);
		return list;
	}
	//取出所有数目
	public int admin_getAllappCount()
	{
		String hql="select count(*) from App";
		String pagecount=this.normalexecute(hql, null);
		return Integer.parseInt(pagecount);
	}
	
	public List admin_getAllUser(int pageNow)
	{
		String hql="from Users";
		List list=this.executeByPage(pageNow,4, null, hql);
		return list;
	}
	
	//取出所有数目
	public int admin_getAllUsersCount()
	{
		String hql="select count(*) from Users";
		String pagecount=this.normalexecute(hql, null);
		return Integer.parseInt(pagecount);
	}
	
	public List admin_getAllComment(int pageNow)
	{
		String hql="from Appcomment";
		List list=this.executeByPage(pageNow,4, null, hql);
		return list;
	}
	
	//取出所有数目
	public int admin_getAllAppCommentCount()
	{
		String hql="select count(*) from Appcomment";
		String pagecount=this.normalexecute(hql, null);
		return Integer.parseInt(pagecount);
	}

}
