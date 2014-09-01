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
		//然后调用父类的方法可以查询出来
		//不能用string parameter,因为万一有id呢
		//String parameters[]=null;
		Object[] parameters={user.getUsername(),user.getPwd()};
//		System.out.println("到这里来了吗");
//		System.out.println("需要的参数是"+user.getUsername());
		Users user2=(Users) this.executeQuery(hql, parameters);
		return user2;
	}    
	//上面只是一个添加函数
	public void addUser(Users user) 
	{
		this.add(user);
	}
	

}
