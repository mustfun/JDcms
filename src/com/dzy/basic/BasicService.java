package com.dzy.basic;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class BasicService implements BasicServiceinterface {
	
//	@Resource(name="sessionFactory")  //���Գɹ�
	@Resource
	//��Ϊ���������ע��,���к���ļ̳и����service��ע��ʱ������д������
	//�������ע����ͨ��byname�ķ�ʽע�룬���bean    
	//����Ȳ�ָ�� name Ҳ��ָ�� type ���ԣ���ʱ��ͨ���������ʹ�� byName �Զ�ע�����
	private SessionFactory sessionFactory;
/*	public void setSessionFactory(SessionFactory sessionFactory) {
		//System.out.println("sessionfactory�Ѿ��Զ�װ������");
		this.sessionFactory = sessionFactory;
	}*/  
	//��ע�ⷽ����@resourceֻ��ͨ��byname���������Բ�Ҫ���set����
	//sessionfactoryΪ�գ����ܾ���û�����get����������
//	public SessionFactory getSessionFactory() {
//			return sessionFactory;
//	}


	//	public Object UniqueObject(Object obj,String parameters[])
//	{
//		
//	}
	//����д������,��Ȼ��һ����ѯ����
	public Object executeQuery(String hql, Object[] parameters) {
		//Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		//�и�ֱ��set��ramenter�ķ������ǾͲ�����ô�鷳����
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters.length>0&&parameters!=null)
		{
			for(int i=0;i<parameters.length;i++)
			{
				query.setParameter(i, parameters[i]);
			}
		}
		return query.uniqueResult();
	}
	public void add(Object obj) {
		this.sessionFactory.getCurrentSession().save(obj);
	}
	
	//�ṩһ��update�ķ�����
	public void update(Object obj)
	{
		this.sessionFactory.getCurrentSession().update(obj);
	}
	//�ṩһ��update�������Եķ���
	public int PartupdateByHql(String hql,Object parameters[])
	{
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0)
		{
			for(int i=0;i<parameters.length;i++)
			{
				query.setParameter(i, parameters[i]);
			}
		}
		return query.executeUpdate();
	}
	
	public List ShowObject(String hql, Object[] parameters) {
		
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0)
		{
			for(int i=0;i<parameters.length;i++)
			{
				query.setParameter(i, parameters[i]);
			}
		}
		return query.list();
	}
	//ͨ��һ��id�ҵ�һ������
	public Object findById(Class clazz,Serializable id) {
		return this.sessionFactory.getCurrentSession().load(clazz, id);
		
	}
	//��ҳ��ʾ��һ������
	public List executeByPage(int pageNow, int pageSize, Object[] parameters,
			String hql) {
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0)
		{
			for(int i=0;i<parameters.length;i++)
			{
				query.setParameter(i, parameters[i]);
			}
		}
		List list=query.setFirstResult((pageNow-1)*pageSize).setMaxResults(pageSize).list();
		return list;
	}
	//���ỹҪд���������Բ�ѯ�����е�����
	
	//�����������ȡ�����ݿ������
	public List executeLastPage(String hql,Object[] parameters,int howmany){
		
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0)
		{
			for(int i=0;i<parameters.length;i++)
			{
				query.setParameter(i, parameters[i]);
			}
		}
		List list=query.setMaxResults(howmany).list();
		return list;
	}
	//����һ����ͨ��execute
	public String normalexecute(String hql,Object parameters[])
	{
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0)
		{
			for(int i=0;i<parameters.length;i++)
			{
				query.setParameter(i, parameters[i]);
			}
		}
		return query.uniqueResult().toString();
	}
}
