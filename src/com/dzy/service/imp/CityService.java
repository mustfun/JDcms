package com.dzy.service.imp;

import java.util.List;

import com.dzy.basic.BasicService;
import com.dzy.service.interfac.CityServiceInterface;

public class CityService extends BasicService implements
		CityServiceInterface {

	public List ShowCity() {
		String hql="from City where Province.id=?";
		//默认第一个吧
		
		return this.ShowObject(hql,null);
	}

}
