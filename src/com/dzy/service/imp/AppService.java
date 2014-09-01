package com.dzy.service.imp;

import java.util.List;

import org.hibernate.dialect.IngresDialect;

import com.dzy.basic.BasicService;
import com.dzy.domain.App;
import com.dzy.service.interfac.AppServiceInterface;

public class AppService extends BasicService implements AppServiceInterface {

	public List getAllSameTypeApp(Integer pageNow,Integer id) {
		String hql="from App where appType=?";
		Object parameters[]={id};
		List<App> list=this.executeByPage(pageNow, 4, parameters, hql);
		return list;
	}
	
	public int getAllSameTypeAppCount(Integer typeid)
	{
		String hql="select count(*) from App where appType=?";
		Object parameters[]={typeid};
		String pageCount=this.normalexecute(hql, parameters);
		return Integer.parseInt(pageCount);
	}
	
	public int getAllappCount()
	{
		String hql="select count(*) from App";
		String pagecount=this.normalexecute(hql, null);
		return Integer.parseInt(pagecount);
	}

}
