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
		super(str);  // ���ø���Ĺ��췽��Ϊ�̶߳�������
	}
	
	public void run() {
	for (int i=0; i<3; i++) {
		System.out.println(getName()+"������");
		try {
			sleep(1000);  // ������1000�����������ĸ��߳�������
		    System.out.println(getName()+"������");
		} catch (InterruptedException e) {}
	}
	System.out.println(getName()+"�ѽ���");
	}
}

