package com.dzy.service.imp;

import java.util.List;

import com.dzy.basic.BasicService;
import com.dzy.service.interfac.CityServiceInterface;

public class CityService extends BasicService implements
		CityServiceInterface {

	public List ShowCity() {
		String hql="from City where Province.id=?";
		//Ĭ�ϵ�һ����
		
		return this.ShowObject(hql,null);
	}

}
