package 网络编程.URL;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * java之URL编程——按行读取网络文本文件的内容
 * 访问指定URL的资源的第一种方法：利用URL类的openStream()方法
 */
/*
 * 1、创建一个URL对象url,（注意要处理异常）
 * 2、使用url.openStream()打开个输入流 例如  InputStream ins=url.openStream();
 * 	  openStream()方法返回的是输入字节流InputStream类的 对象
 * 	  为了提供读取速度，希望能按行读取网页内容
 *   具体方法分两步：  
 *    1）InputStreamReader isr=new InputStreamReader(ins,"UTF-8");  
 *         作用将字节流转换为"UTF-8”编码的字符流,这样非英语字符才能正确显示
 *    2）BufferedReader buffer=new BufferedReader(isr);
 *         作用是利用带缓存的输入流，可以按行读取，提供读取速度
 * 3、按行读取网页内容
 *     String readline=buffer.readLine();
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		URL url=null;
		String str="http://www.baidu.com";
		try {
			//1、创建URL对象
			url=new URL(str);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			//2、打开输入流。URL对象的openStream() 方法返回的返回InputStream输入流对象
			InputStream ins=url.openStream();
		
			//将输入字节流转换为字符流
			InputStreamReader isr=new InputStreamReader(ins,"UTF-8");  
			//使用BufferedReader类提高读取效率（按行读取）
			BufferedReader buffer=new BufferedReader(isr);
			
			//3、读取网页内容（代码）
			String readline=buffer.readLine();
			while (readline!=null){			
				System.out.println(readline);
				readline=buffer.readLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
