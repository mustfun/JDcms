package com.dzy.util;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

public class test {

	
	public static void main(String[] args) {
	
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00")); 
		String year=c.get(Calendar.YEAR)+"";
		 String month=c.get(Calendar.MONTH)+"";
		 String day=c.get(Calendar.DATE)+"";
		 String all=year+month+day;
		System.out.println(c.get(Calendar.YEAR));
		System.out.println("������"+all);
		System.out.println(UUID.randomUUID().toString());
		//������Data����1900Ҳ����
		System.out.println("*******************************");
		String a=MyMD5.MD5("aaa");
		System.out.println(a);
	}
	

}
