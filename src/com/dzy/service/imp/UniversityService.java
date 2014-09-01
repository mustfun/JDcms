package com.dzy.service.imp;

import java.io.Serializable;
import java.util.List;

import com.dzy.basic.BasicService;
import com.dzy.service.interfac.UniversityServiceInterface;

public class UniversityService extends BasicService implements UniversityServiceInterface {
	
	public List ShowUniversity(Object obj[])
	{
		String hql="from University where province.id=?";
		return this.ShowObject(hql, obj);
	}
//
//	public Integer[] GetOtherIdFromUniversityId(Serializable id) {
//		String hql="select University.province,University.city from University where id=?";
//		Serializable[] id2={id};
//	    return  (Integer[]) this.executeQuery(hql, id2);
//	}
}
