package thread;
/**
 *   协调同步的线程
 *   完成不同任务的两个线程轮流执行
 */

//生产者程序
class Producer extends Thread {
	  private Share shared;
	  private int number;
	  public Producer(Share s, int number) {
	    shared=s;
	    this.number=number;
	  }
	  public void run() {
	    for (int i=0; i<10; i++) {
	      shared.put(i);
	      System.out.println("生产者"+this.number+"  输出的数据为："+i);
	      try {
	        sleep((int)(Math.random() * 100));
	      } catch (InterruptedException e) {}
	    }
	  }
}
//消费者程序
class Consumer extends Thread {
	  private Share shared;
	  private int number;
	  public Consumer(Share s, int number) {
	    shared=s;
	    this.number=number;
	  }
	  public void run() {
	    int value = 0;
	    for (int i=0; i<10; i++) {
	      value=shared.get();
	      System.out.println("消费者"+this.number+"  得到的数据为："+value);
	    }
	  }
}

//共享数据
//class Share {
//	  private int contents;   //产品数量
//  public int get(){
//    return contents;
//  }
//  public void put(int value){
//    contents=value;
//  }
//}

class Share {
	  private int contents;
	  private boolean available=false;	  
	  public synchronized int get(){
	    while (available==false) {
	      try {
	    	  wait();
	      } catch (InterruptedException e) {}
	    }
	    available=false;
	    notifyAll();
	    return contents;
	  }
	  public synchronized void put(int value) {
		   while (available==true) {
			   try {
				   wait();
			   } catch (InterruptedException e) { }
		   }
		   contents=value;
		   available=true;
		   notifyAll();
	  }
}


public class PCTest {
  public static void main(String[] args) {
    Share s=new Share();
    Producer p=new Producer(s,1);
    Consumer c=new Consumer(s,1);
    p.start();
    c.start();
  }
}

