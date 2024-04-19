package com.downloadpictures;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

/*
 * 利用多线程下载图片
 * 我们使用Commons IO工具类库的FileUtils.copyURLToFile方法下载文件。
 * 
 * 1、Commons IO工具类库的下载和配置：
 *   下载地址：http://commons.apache.org/proper/commons-io/download_io.cgi
 *   配置方法：https://www.cnblogs.com/Satu/p/10853164.html
 * 2、编程实现
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

//文件下载工具类
class WebDownloader{
	//远程路径，存储名字
	public void downloader(String url, String name){
		try {
			FileUtils.copyURLToFile(new URL(url), new File(name));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件下载失败");
		}
	}
}
