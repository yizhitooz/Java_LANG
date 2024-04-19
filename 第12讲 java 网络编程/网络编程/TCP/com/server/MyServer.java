package 网络编程.TCP.com.server;
/**
 *   利用Socket编程传递对象流
 *   服务器端
 */
import java.net.*;

import 网络编程.TCP.com.common.User;

import java.io.*;
public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyServer ms=new MyServer();
	}

	public MyServer()
	{
		try{
			System.out.println("3350端口在监听......");
			ServerSocket ss=new ServerSocket(3350);
			Socket s=ss.accept();			
			//以对象流方式读取（假设客户端发送的是User对象）
			ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
			User u=(User)ois.readObject();
			
			//输出
			System.out.println("从客户端接收到"+u.getName()+"  "+u.getPass());
			
			s.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
