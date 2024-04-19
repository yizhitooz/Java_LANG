package com.downloadpictures;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

/*
 * ���ö��߳�����ͼƬ
 * ����ʹ��Commons IO��������FileUtils.copyURLToFile���������ļ���
 * 
 * 1��Commons IO�����������غ����ã�
 *   ���ص�ַ��http://commons.apache.org/proper/commons-io/download_io.cgi
 *   ���÷�����https://www.cnblogs.com/Satu/p/10853164.html
 * 2�����ʵ��
 */
public class Example extends Thread{
	String url;
	String name;
	public Example(String url,String name){
		this.url=url;
		this.name=name;
	}
	public void run(){
		WebDownloader webDownloader=new WebDownloader();
		webDownloader.downloader(url, name);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example t1=new Example("https://www.guet.edu.cn/__local/E/54/43/FE3601E904EA037477DA2AD505F_356C62AE_19335.jpg","D:/1.jpg");
		Example t2=new Example("https://www.guet.edu.cn/__local/4/A0/8E/03E0DCB8BC295AACC1FB3D65DDA_EC53D387_2BAC6.jpg","D:/2.jpg");
		t1.start();
		t2.start();
	}
}

//�ļ����ع�����
class WebDownloader{
	//Զ��·�����洢����
	public void downloader(String url, String name){
		try {
			FileUtils.copyURLToFile(new URL(url), new File(name));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ�����ʧ��");
		}
	}
}
