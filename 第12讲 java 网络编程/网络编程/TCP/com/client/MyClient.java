package ������.TCP.com.client;
/**
 *   ����Socket��̴��ݶ�����   
 *   �ͻ���
 *   ObjectOutputStream�ࣺ���������
 */
import java.net.*;

import ������.TCP.com.common.User;

import java.io.*;
public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClient mc=new MyClient();
	}
	
	public MyClient()
	{
		try{
			Socket s=new Socket("127.0.0.1", 3350);
			//ͨ��ObjectOutputStream�����������Ͷ���
			ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
			User u=new User();
			u.setName("���ƻ�");
			u.setPass("123456");
			oos.writeObject(u);  //���ݸ�������
			
			s.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
