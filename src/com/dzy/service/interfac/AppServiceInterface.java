package com.dzy.service.interfac;

import java.util.List;

import com.dzy.basic.BasicServiceinterface;

public interface AppServiceInterface extends BasicServiceinterface {
	
	//�������ȡ��
	public List getAllSameTypeApp(Integer pageNow,Integer id);
	public int getAllSameTypeAppCount(Integer typeid);
	public int getAllappCount();
}
