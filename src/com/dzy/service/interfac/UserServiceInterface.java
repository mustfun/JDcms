package com.dzy.service.interfac;

import com.dzy.basic.BasicServiceinterface;
import com.dzy.domain.Users;

public interface UserServiceInterface extends BasicServiceinterface {
	
	//�����ﶨ��һЩ���û�������һЩ��������������к�������ͬ�ķ�����
	//�Ϳ��Էŵ�baseserviceinterface����
	public Users checkUser(Users user);
	public void addUser(Users user);
}
