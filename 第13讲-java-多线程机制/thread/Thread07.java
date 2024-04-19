package thread;
/*
 * 线程（5）
 * 演示 两种方法创建线程的区别
 * 该程序是一个“机票销售系统”         
 * 已解决实现数据共享问题     
 * synchronized(this){  
		//同步方法
   }	
 */
public class Thread07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		TicketWindow1 w1=new TicketWindow1();
		
		//三个线程共享同一段代码
		Thread t1=new Thread(w1);
		Thread t2=new Thread(w1);
		Thread t3=new Thread(w1);
		t1.start();
		t2.start();
		t3.start();		
	}    
}

//售票窗口类
//作为一个线程，目的是不停卖票
class TicketWindow1 implements Runnable{
	private int totalTickets=10;

	public synchronized void saleTicket(){
		if (totalTickets>0){
			try {			
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			} 
			System.out.println(Thread.currentThread().getName()+"当前在出售第"+totalTickets+"张票");
			totalTickets--;	
		}
		else
			System.exit(1);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			saleTicket();
		}//while
	}	
}