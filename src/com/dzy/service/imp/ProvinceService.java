package com.dzy.service.imp;

import java.util.List;

import com.dzy.basic.BasicService;
import com.dzy.service.interfac.ProvinceServiceInterface;

public  class ProvinceService extends BasicService implements
		ProvinceServiceInterface {
	
	//��ʾ���еĳ�ʵ,��ҳ��Ҫ��
	public List ShowProvince()
	{
		String hql="from Province";
		System.out.println("�ҾͿ��º�������������û��");
		return this.ShowObject(hql, null);
	}
}
