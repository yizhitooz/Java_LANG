package ������.TCP.com.server;
/**
 *   ����Socket��̴��ݶ�����
 *   ��������
 */
import java.net.*;

import ������.TCP.com.common.User;

import java.io.*;
public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyServer ms=new MyServer();
	}

	public MyServer()
	{
		try{
			System.out.println("3350�˿��ڼ���......");
			ServerSocket ss=new ServerSocket(3350);
			Socket s=ss.accept();			
			//�Զ�������ʽ��ȡ������ͻ��˷��͵���User����
			ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
			User u=(User)ois.readObject();
			
			//���
			System.out.println("�ӿͻ��˽��յ�"+u.getName()+"  "+u.getPass());
			
			s.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
