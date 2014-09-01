package com.dzy.service.interfac;

import java.util.List;

import com.dzy.basic.BasicServiceinterface;

public interface ShowAppServiceInterface extends BasicServiceinterface {

	public List showFirstPageApp(int pageNow,int pageSize);
	public List showMostDownload();
}
