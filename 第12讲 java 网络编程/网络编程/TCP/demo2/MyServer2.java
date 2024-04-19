package 网络编程.TCP.demo2;


/** 半双工，客户端与服务端进行控制台输入交流
 *             服务端源代码
 * 功能：是一个服务器端，在9999端口上监听
 * 可以通过控制台,输入回送给客户端的信息
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class MyServer2 {
	InputStreamReader isr,isr2;
	BufferedReader br,br2;
	PrintWriter pw;
	
	public static void main(String[] args) {
		new MyServer2();
	}

	//构造函数
	public MyServer2(){
		try {
			//在9999号端口上监听
			System.out.println("在端口9999上监听");
			ServerSocket ss=new ServerSocket(9999);
			//等待客户端连接，该函数会返回一个Socket连接
			Socket s=ss.accept();
			//要读取s中传递的数据
			isr=new InputStreamReader(s.getInputStream());
			br=new BufferedReader(isr);
			
			pw=new PrintWriter(s.getOutputStream(),true);
			
			//接收从控制台输入的信息
			isr2=new InputStreamReader(System.in);
			br2=new BufferedReader(isr2);
			while(true){
				//接收客户端信息
				String infoFromClient=br.readLine();
				System.out.println("服务器接收到:\t"+infoFromClient);
				//接收从控制台输入的信息
				System.out.println("请输入要发送到客户端的信息：");
				String response=br2.readLine();
				//服务器从控制台上接收bye服务器端退出
				if(response.equals("bye")){
					System.out.println("退出对话");
					s.close();
					break;
				}
				//把从控制台输入的信息，回送给客户端
				pw.println(response);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(br2!=null) br2.close();
				if(isr2!=null) isr2.close();
				if(pw!=null) pw.close();
				if(br!=null) br.close();
				if(isr!=null) isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

