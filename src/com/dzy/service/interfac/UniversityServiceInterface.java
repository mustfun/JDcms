package com.dzy.service.interfac;

import java.io.Serializable;
import java.util.List;

import com.dzy.basic.BasicServiceinterface;

public interface UniversityServiceInterface extends BasicServiceinterface {

	public List ShowUniversity(Object[] obj);
	//public Integer[] GetOtherIdFromUniversityId(Serializable id);
}
