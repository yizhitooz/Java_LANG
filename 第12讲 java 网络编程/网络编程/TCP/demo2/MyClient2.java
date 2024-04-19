package 网络编程.TCP.demo2;


/**           客户端源代码
 * 这是一个客户端程序，可以连接服务器端口9999
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class MyClient2 {
	InputStreamReader isr,isr2;
	BufferedReader br,br2;
	PrintWriter pw;
	
	public static void main(String[] args) {
		new MyClient2();
	}
	
	public MyClient2(){
		try {
			//连接服务器端
			Socket s=new Socket("127.0.0.1",9999);
			
			pw=new PrintWriter(s.getOutputStream(),true);
			//控制台接收信息
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			
			//从服务器接收信息
			isr2=new InputStreamReader(s.getInputStream());
			br2=new BufferedReader(isr2);
			
			while(true){
				//客户端先从控制台接收
				String info=br.readLine();
				//然后发送给服务器
				pw.println(info);
				//客户端从控制台上输入byebye信息，客户端退出
				if(info.equals("byebye")){
					System.out.println("客户端退出对话");
					s.close();
					break;
				}
				
				//接收从服务器发来的信息
				String res=br2.readLine();
				System.out.println("客户端接收到的信息："+res);
				//客户端接收服务端发送来的byebye信息，客户端退出
				if(res.equals("byebye")){
					System.out.println("服务器端强制客户端退出对话");
					s.close();
					break;
				}
			}
		} catch (Exception e) {
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
