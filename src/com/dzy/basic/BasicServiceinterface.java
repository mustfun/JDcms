package com.dzy.basic;

import java.io.Serializable;
import java.util.List;

public interface BasicServiceinterface {
	
	//定义一些通用的方法,解决代码的复用性
	//1.定义通用的查询方法
	public Object executeQuery(String hql,Object[] parameters);
	public void add(Object obj);
	//定义一个可以查询出一批的方法
	public List ShowObject(String hql,Object[] parameters);
	public Object findById(Class clazz,Serializable id);
	//这个函数可以在主页显示一些应用信息，但是很多可能需要这样显示，我就定义到基础接口里面来了
	public List executeByPage(int pageNow,int pageSize,Object[] parameters,String hql);
	public void update(Object obj);
	public int PartupdateByHql(String hql,Object parameters[]);
	
	public List executeLastPage(String hql,Object[] parameters,int howmany);
}
