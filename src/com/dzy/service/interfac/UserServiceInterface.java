package com.dzy.service.interfac;

import com.dzy.basic.BasicServiceinterface;
import com.dzy.domain.Users;

public interface UserServiceInterface extends BasicServiceinterface {
	
	//在这里定义一些对用户操作的一些基本方法，如果有和其它相同的方法，
	//就可以放到baseserviceinterface中了
	public Users checkUser(Users user);
	public void addUser(Users user);
}
