package com.dzy.basic;

import java.io.Serializable;
import java.util.List;

public interface BasicServiceinterface {
	
	//����һЩͨ�õķ���,�������ĸ�����
	//1.����ͨ�õĲ�ѯ����
	public Object executeQuery(String hql,Object[] parameters);
	public void add(Object obj);
	//����һ�����Բ�ѯ��һ���ķ���
	public List ShowObject(String hql,Object[] parameters);
	public Object findById(Class clazz,Serializable id);
	//���������������ҳ��ʾһЩӦ����Ϣ�����Ǻܶ������Ҫ������ʾ���ҾͶ��嵽�����ӿ���������
	public List executeByPage(int pageNow,int pageSize,Object[] parameters,String hql);
	public void update(Object obj);
	public int PartupdateByHql(String hql,Object parameters[]);
	
	public List executeLastPage(String hql,Object[] parameters,int howmany);
}
