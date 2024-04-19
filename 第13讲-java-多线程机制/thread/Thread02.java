package thread.test1;

import java.util.Date;

/**
 * 演示如何通过Runnable接口来开发线程
 */
public class Thread02{
	public static void main(String []args){
		CurrentTime ct=new CurrentTime();
		//创建线程
		Thread t=new Thread(ct);
		//启动线程
		t.start();
	}
}
class CurrentTime implements Runnable{//创建Runnable接口
	public void run(){
		int times=0;
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
