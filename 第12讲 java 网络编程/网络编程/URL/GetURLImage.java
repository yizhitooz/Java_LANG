package ������.URL;
/**
 * java֮URL��̡�����ȡ��ҳ�е�ͼƬ������ͼƬ����Ϊ�ļ�
 * ����ָ��URL����Դ�ĵڶ��ַ���������URL���openConnection()����
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
			//ʹ��URL���openConnection()��������һ��URLConnection��Ķ���
			httpUrl = (HttpURLConnection) url.openConnection();
			//����URL��Դ
			httpUrl.connect();
			//�������������ڶ�ȡ��ҳ�е����ݣ�ͼƬ��
			InputStream ins=httpUrl.getInputStream();
			//����ȡ��ͼƬ����Ϊ��haha.jpg���ļ�
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