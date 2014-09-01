package com.dzy.util;

import java.security.MessageDigest;

public class MyMD5 {
	public  static String MD5(String pwd) {
		//���ڼ��ܵ��ַ�
		char md5String[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			//ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte���У���������洢��һ���µ� byte������
			byte[] btInput = pwd.getBytes();
			
			// ���ָ��ժҪ�㷨�� MessageDigest���󣬴˴�ΪMD5
			//MessageDigest��ΪӦ�ó����ṩ��ϢժҪ�㷨�Ĺ��ܣ��� MD5 �� SHA �㷨��
			//��ϢժҪ�ǰ�ȫ�ĵ����ϣ�����������������С�����ݣ�������̶����ȵĹ�ϣֵ�� 
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			//System.out.println(mdInst);  
			//MD5 Message Digest from SUN, <initialized>
			
			//MessageDigest����ͨ��ʹ�� update�����������ݣ� ʹ��ָ����byte�������ժҪ
			mdInst.update(btInput);
			//System.out.println(mdInst);  
			//MD5 Message Digest from SUN, <in progress>
			
			// ժҪ����֮��ͨ������digest����ִ�й�ϣ���㣬�������
			byte[] md = mdInst.digest();
			//System.out.println(md);
			
			// ������ת����ʮ�����Ƶ��ַ�����ʽ
			int j = md.length;
			//System.out.println(j);
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {   //  i = 0
				byte byte0 = md[i];  //95
				str[k++] = md5String[byte0 >>> 4 & 0xf];    //    5  
				str[k++] = md5String[byte0 & 0xf];   //   F
			}
			
			//���ؾ������ܺ���ַ���
			return new String(str);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}