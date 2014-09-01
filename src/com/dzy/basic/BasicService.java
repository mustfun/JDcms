package com.dzy.basic;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class BasicService implements BasicServiceinterface {
	
//	@Resource(name="sessionFactory")  //测试成功
	@Resource
	//因为父类有这个注解,所有后面的继承父类的service类注入时都不用写属性了
	//而且这个注解是通过byname的方式注入，这个bean    
	//如果既不指定 name 也不指定 type 属性，这时将通过反射机制使用 byName 自动注入策略
	private SessionFactory sessionFactory;
/*	public void setSessionFactory(SessionFactory sessionFactory) {
		//System.out.println("sessionfactory已经自动装载了吗");
		this.sessionFactory = sessionFactory;
	}*/  
	//用注解方法，@resource只是通过byname方法，可以不要这个set方法
	//sessionfactory为空，可能就是没有这个get方法，可能
//	public SessionFactory getSessionFactory() {
//			return sessionFactory;
//	}


	//	public Object UniqueObject(Object obj,String parameters[])
//	{
//		
//	}
	//上面写法错误,既然是一个查询方法
	public Object executeQuery(String hql, Object[] parameters) {
		//Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		//有个直接set怕ramenter的方法，那就不用这么麻烦干了
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
	
	//提供一个update的方法；
	public void update(Object obj)
	{
		this.sessionFactory.getCurrentSession().update(obj);
	}
	//提供一个update部分属性的方法
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
	//通过一个id找到一个对象
	public Object findById(Class clazz,Serializable id) {
		return this.sessionFactory.getCurrentSession().load(clazz, id);
		
	}
	//分页显示的一个函数
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
	//过会还要写个函数可以查询到所有的条数
	
	//这个函数可以取出数据库最后几条
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
	//就是一个普通的execute
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
