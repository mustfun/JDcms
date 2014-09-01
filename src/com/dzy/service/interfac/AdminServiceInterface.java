package com.dzy.service.interfac;

import java.util.List;

import com.dzy.basic.BasicServiceinterface;
import com.dzy.domain.Admin;

public interface AdminServiceInterface extends BasicServiceinterface {

	//ºÏ≤Èƒ„ «∑Ò «admin
	public Admin checkAdmin(Admin admin);
	public List admin_getAllApp(int pageNow);
	public int admin_getAllappCount();
	public List admin_getAllUser(int pageNow);
	public int admin_getAllUsersCount();
	public List admin_getAllComment(int pageNow);
	public int admin_getAllAppCommentCount();
}
