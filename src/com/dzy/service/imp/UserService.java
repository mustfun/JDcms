package com.dzy.service.imp;

import com.dzy.basic.BasicService;
import com.dzy.domain.Users;
import com.dzy.service.interfac.UserServiceInterface;

public class UserService extends BasicService implements UserServiceInterface {

//	public UserService()
//	{
//		
//	}
	public Users checkUser(Users user) {
		String hql="from Users where username=? and pwd=?";
		//Ȼ����ø���ķ������Բ�ѯ����
		//������string parameter,��Ϊ��һ��id��
		//String parameters[]=null;
		Object[] parameters={user.getUsername(),user.getPwd()};
//		System.out.println("������������");
//		System.out.println("��Ҫ�Ĳ�����"+user.getUsername());
		Users user2=(Users) this.executeQuery(hql, parameters);
		return user2;
	}    
	//����ֻ��һ����Ӻ���
	public void addUser(Users user) 
	{
		this.add(user);
	}
	

}
