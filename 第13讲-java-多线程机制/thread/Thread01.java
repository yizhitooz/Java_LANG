package thread.test1;

import java.util.Date;

/**
 * 演示如何通过继承Thread来开发线程
 */
public class Thread01 {
	public static void main(String[] args) {
		//创建一个 Cat对象
		CurrentTime ct=new CurrentTime();
		
		//启动线程
		ct.start();//start()会导致run函数运行		
	}
}

class CurrentTime extends Thread{
	int times=0;
	//重写run函数
	public void run(){
		while(true){
			//休眠一秒
			//1000表示1000毫秒
			try {
				Thread.sleep(5000);//sleep就会让该线程进入到Sleep状态,并释放资源。
			} catch (Exception e) {
				e.printStackTrace();
			}
			times++;
			Date dt=new Date();//获取当前日期
			System.out.println(dt.toString());
			if(times==5){
				//退出线程
				break;
			}
		}
	}
}

