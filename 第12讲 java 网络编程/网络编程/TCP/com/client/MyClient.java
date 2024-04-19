package 网络编程.TCP.com.client;
/**
 *   利用Socket编程传递对象流   
 *   客户端
 *   ObjectOutputStream类：对象输出流
 */
import java.net.*;

import 网络编程.TCP.com.common.User;

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
			//通过ObjectOutputStream给服务器传送对象
			ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
			User u=new User();
			u.setName("李云辉");
			u.setPass("123456");
			oos.writeObject(u);  //传递给服务器
			
			s.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
