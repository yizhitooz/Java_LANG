package thread;

class Thread05 {
	  public static void main(String args[]) {
	    testThread t1=new testThread("thread1");
	    testThread t2=new testThread("thread2");
	    t1.start();
	    t2.start();
	  }
}
class testThread extends Thread {
	public testThread(String str) {
		super(str);  // 调用父类的构造方法为线程对象命名
	}
	
	public void run() {
	for (int i=0; i<3; i++) {
		System.out.println(getName()+"在运行");
		try {
			sleep(1000);  // 用休眠1000毫秒来区分哪个线程在运行
		    System.out.println(getName()+"在休眠");
		} catch (InterruptedException e) {}
	}
	System.out.println(getName()+"已结束");
	}
}

