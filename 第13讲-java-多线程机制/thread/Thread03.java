package thread;

/**
 *多线程Thread使用
 *1、一个线程通过接收n来执行1+..+n得到和
 *2、另一线程每隔1秒输出一次hello world!
 */
public class Thread03 {
	public static void main(String[] args) {
		Pig pig=new Pig(10);
		Bird bird=new Bird(10);
		//建立线程
		Thread t1=new Thread(pig);
		Thread t2=new Thread(bird);
		//启动线程
		t1.start();
		t2.start();
	}
}

//打印hello world!
class Pig implements Runnable{
	int n=0;
	int times=0;
	public Pig(int n){
		this.n=n;
	}
	
	public void run(){
		while(true){
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			times++;
			System.out.println("我是一个线程，正在输出第"+times+"个hello world!");
			if(times==n){
				break;
			}
		}
	}
}

//算数学题
class Bird implements Runnable{//多线程时应使用implements接口来实现，不要使用extends继承
	int n=0;
	int res=0;
	int times=0;
	public Bird(int n){
		this.n=n;
	}
	
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			res+=(++times);
			System.out.println("当前结果是："+res);
			if(times==n){
				System.out.println("最后的结果是："+res);
				break;
			}
		}
	}
}
