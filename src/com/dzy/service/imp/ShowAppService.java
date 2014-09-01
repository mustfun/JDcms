package com.dzy.service.imp;

import java.util.List;

import com.dzy.basic.BasicService;
import com.dzy.service.interfac.ShowAppServiceInterface;

public class ShowAppService extends BasicService implements ShowAppServiceInterface {
	public List showFirstPageApp(int pageNow,int pageSize)
	{
		String hql="from App order by id desc";
		return this.executeByPage(pageNow, pageSize, null, hql);
	}
	
	//显示下载量的
	public List showMostDownload()
	{
		String hql="from App order by appDownnum desc";
		return this.executeLastPage(hql, null, 5);
	}
}
