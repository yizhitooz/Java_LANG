package ������.URL;
/**
 * java֮URL���
 * ��̬��ȡ������Դ
 * ÿ��1���ȡһ�������ϵ��ļ�����
 */
import java.io.*;
import java.net.*;

import javax.swing.JFrame;

import java.awt.*;
public class Demo3 extends JFrame implements Runnable{
	Thread dthread; 
	URL fileur;
	TextArea showarea = new TextArea("Wait for a while...\n",5,100);
	
	public void init(){
		//String url = " http://localhost/postinfo.html";
		String url="http://www.guet.edu.cn/extGuetWeb";
		try{ fileur = new URL(url); }
		catch(MalformedURLException e){System.out.println("Can��t open the URL");}
		add(showarea);
		
		this.setTitle("���ж�ȡURLָ����������Դ");
		this.setSize(600, 500);
		this.setVisible(true);
		
		start();
		//stop();
	}
	public void start(){
		if(dthread == null){
			dthread = new Thread(this); dthread.start(); 
		}
	}
//	public void stop(){
//		if (dthread != null){dthread.stop(); dthread = null;} 
//	}
	@SuppressWarnings("deprecation")
	public void run(){
		InputStream filecon = null; 
		//DataInputStream filedata = null; 
		BufferedReader filedata=null;
		String fileline=null;
		
		while(true){
			try{ 
			    filecon = fileur.openStream();   //����URL, ���ش�������Դ��ȡ����������InputStream�����
				InputStreamReader isr=new InputStreamReader(filecon,"utf-8");		    
				filedata = new BufferedReader(isr); 
				fileline = filedata.readLine();
				while(fileline!=null){	
					//fileline=new String(fileline.getBytes("gbk"),"utf-8");
					showarea.append(fileline+"\r\n");
					System.out.println(String.valueOf(fileline));
					fileline = filedata.readLine();
				}					
			} catch(IOException e){
				System.out.println("IO Error"+e.getMessage());
			}
			try { dthread.sleep(1000); } catch (InterruptedException e){}
			//repaint();
			if (fileline==null) 
			{  
			   System.out.println("����");
			   break;
			}
		}
	}
	public static void main(String[] args){
		Demo3 jf=new Demo3();
		jf.init();
	}
}