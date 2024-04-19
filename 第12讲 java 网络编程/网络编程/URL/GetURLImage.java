package 网络编程.URL;
/**
 * java之URL编程——读取网页中的图片，并将图片保存为文件
 * 访问指定URL的资源的第二种方法：利用URL类的openConnection()方法
 */
import java.io.BufferedInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

 public class GetURLImage {

	 public void saveToFile(String destUrl) {
		 FileOutputStream fos = null;
		 BufferedInputStream bis = null;
		 HttpURLConnection httpUrl = null;
		 URL url = null;
		 int BUFFER_SIZE = 1024;
		 byte[] buf = new byte[BUFFER_SIZE];
		 int size = 0;
		 
		try {
			url = new URL(destUrl);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			//使用URL类的openConnection()方法创建一个URLConnection类的对象
			httpUrl = (HttpURLConnection) url.openConnection();
			//连接URL资源
			httpUrl.connect();
			//打开输入流，用于读取网页中的数据（图片）
			InputStream ins=httpUrl.getInputStream();
			//将读取的图片保存为“haha.jpg”文件
			 fos = new FileOutputStream("haha.jpg");	
			while ((size = ins.read(buf)) != -1) {
				 System.out.println("***********");
				 fos.write(buf,0,size);				 
			}
		//fos.flush();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		try {
			 fos.close();
			 bis.close();
			 httpUrl.disconnect();
		 } catch (IOException e) {		 } 
		 catch (NullPointerException e) { }
		 
	 }
	 public static void main(String[] args) {
	 // TODO Auto-generated method stub
	
		 GetURLImage dw=new GetURLImage();
		 //dw.saveToFile("http://www.guet.edu.cn/extGuetWeb/img/loading.gif");		
		 dw.saveToFile("http://www.guet.edu.cn/adminui/ExternalMainWeb/UpLoadFiles/2017111805546.gif");
	}
 }