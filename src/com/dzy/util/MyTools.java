package com.dzy.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.upload.FormFile;

public  class MyTools {
	public static String uploadlogo(HttpServletRequest request,FormFile fileForm)
	{
		 String all=getimagesrc();
		 String newlogoName="";
		 try{
			//考虑给每个用户创建自己的文件夹.
			String filePath=request.getSession().getServletContext().getRealPath("/");
			//filePath就是当前这个web应用是绝对路径 F:\apache-tomcat-6.0.20\webapps\xiaoneinew
			InputStream is = fileForm.getInputStream();// 把文件读入
			String logoName=fileForm.getFileName();
			String newFullNewPath=filePath+"\\images\\game\\"+all+"\\App_logo\\";
			//判断newFullNewPath文件夹是否存在
			File f=new File(newFullNewPath);
			if(!f.isDirectory()){
				//不是文件夹,创建即可
				f.mkdirs();
			}
			//把上传的logo名字修成成 编号.后缀
			newlogoName=UUID.randomUUID().toString()+ logoName.substring(logoName.indexOf("."), logoName.length());
			OutputStream os = new FileOutputStream(newFullNewPath+ newlogoName);
			int len = 0;
			byte[] buffer = new byte[1024];
			while ((len = is.read(buffer, 0, 1024)) != -1) {
				os.write(buffer, 0, len);// 将文件写入服务器
			}
			os.close();
			is.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return newlogoName;
	}
	
	/*public void addload(HttpServletRequest request,HttpServletResponse response)
	{
		//自己模拟写一个文件上传
		//思路，首先服务器需要读取你的文件的路径，然后加载到内存中，然后写入的服务器的磁盘中
		String filepath=request.getSession().getServletContext().getRealPath("/");
		//filepath包括了服务器已经应用名的路径
		try {
			String filterFilename=java.net.URLEncoder.encode(user.getPhotoname(),"utf-8");
			response.setHeader("Content-Disposition","atachment;filename="+filterFilename);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}*/
	
	public static String uploadjietu(HttpServletRequest request,FormFile fileForm)
	{
		 String all=getimagesrc();
		 String newjietuName="";
		 try{
			//考虑给每个用户创建自己的文件夹.
			String filePath=request.getSession().getServletContext().getRealPath("/");
			//filePath就是当前这个web应用是绝对路径 F:\apache-tomcat-6.0.20\webapps\xiaoneinew
			InputStream is = fileForm.getInputStream();// 把文件读入
			String logoName=fileForm.getFileName();
			String newFullNewPath=filePath+"\\images\\game\\"+all+"\\App\\";
			//判断newFullNewPath文件夹是否存在
			File f=new File(newFullNewPath);
			if(!f.isDirectory()){
				//不是文件夹,创建即可
				f.mkdirs();
			}
			//把上传的logo名字修成成 编号.后缀
			newjietuName=UUID.randomUUID().toString() + logoName.substring(logoName.indexOf("."), logoName.length());
			OutputStream os = new FileOutputStream(newFullNewPath+ newjietuName);
			int len = 0;
			byte[] buffer = new byte[1024];
			while ((len = is.read(buffer, 0, 1024)) != -1) {
				os.write(buffer, 0, len);// 将文件写入服务器
			}
			os.close();
			is.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return newjietuName;
	}
	
	public static String getimagesrc()
	{
		Calendar c=Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));
		 String year=c.get(Calendar.YEAR)+"";
		 String month=c.get(Calendar.MONTH)+1+"";
		 String day=c.get(Calendar.DATE)+"";
		 String all=year+month+day;
		 return all;
	}
}
