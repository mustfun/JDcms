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
			//���Ǹ�ÿ���û������Լ����ļ���.
			String filePath=request.getSession().getServletContext().getRealPath("/");
			//filePath���ǵ�ǰ���webӦ���Ǿ���·�� F:\apache-tomcat-6.0.20\webapps\xiaoneinew
			InputStream is = fileForm.getInputStream();// ���ļ�����
			String logoName=fileForm.getFileName();
			String newFullNewPath=filePath+"\\images\\game\\"+all+"\\App_logo\\";
			//�ж�newFullNewPath�ļ����Ƿ����
			File f=new File(newFullNewPath);
			if(!f.isDirectory()){
				//�����ļ���,��������
				f.mkdirs();
			}
			//���ϴ���logo�����޳ɳ� ���.��׺
			newlogoName=UUID.randomUUID().toString()+ logoName.substring(logoName.indexOf("."), logoName.length());
			OutputStream os = new FileOutputStream(newFullNewPath+ newlogoName);
			int len = 0;
			byte[] buffer = new byte[1024];
			while ((len = is.read(buffer, 0, 1024)) != -1) {
				os.write(buffer, 0, len);// ���ļ�д�������
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
		//�Լ�ģ��дһ���ļ��ϴ�
		//˼·�����ȷ�������Ҫ��ȡ����ļ���·����Ȼ����ص��ڴ��У�Ȼ��д��ķ������Ĵ�����
		String filepath=request.getSession().getServletContext().getRealPath("/");
		//filepath�����˷������Ѿ�Ӧ������·��
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
			//���Ǹ�ÿ���û������Լ����ļ���.
			String filePath=request.getSession().getServletContext().getRealPath("/");
			//filePath���ǵ�ǰ���webӦ���Ǿ���·�� F:\apache-tomcat-6.0.20\webapps\xiaoneinew
			InputStream is = fileForm.getInputStream();// ���ļ�����
			String logoName=fileForm.getFileName();
			String newFullNewPath=filePath+"\\images\\game\\"+all+"\\App\\";
			//�ж�newFullNewPath�ļ����Ƿ����
			File f=new File(newFullNewPath);
			if(!f.isDirectory()){
				//�����ļ���,��������
				f.mkdirs();
			}
			//���ϴ���logo�����޳ɳ� ���.��׺
			newjietuName=UUID.randomUUID().toString() + logoName.substring(logoName.indexOf("."), logoName.length());
			OutputStream os = new FileOutputStream(newFullNewPath+ newjietuName);
			int len = 0;
			byte[] buffer = new byte[1024];
			while ((len = is.read(buffer, 0, 1024)) != -1) {
				os.write(buffer, 0, len);// ���ļ�д�������
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
