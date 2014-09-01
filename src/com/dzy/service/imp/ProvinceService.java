package com.dzy.service.imp;

import java.util.List;

import com.dzy.basic.BasicService;
import com.dzy.service.interfac.ProvinceServiceInterface;

public  class ProvinceService extends BasicService implements
		ProvinceServiceInterface {
	
	//显示所有的诚实,首页需要用
	public List ShowProvince()
	{
		String hql="from Province";
		System.out.println("我就看下函数到这里来了没有");
		return this.ShowObject(hql, null);
	}
}
