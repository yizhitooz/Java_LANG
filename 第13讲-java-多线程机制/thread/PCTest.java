package thread;
/**
 *   Э��ͬ�����߳�
 *   ��ɲ�ͬ����������߳�����ִ��
 */

//�����߳���
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
	      System.out.println("������"+this.number+"  ���������Ϊ��"+i);
	      try {
	        sleep((int)(Math.random() * 100));
	      } catch (InterruptedException e) {}
	    }
	  }
}
//�����߳���
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
	      System.out.println("������"+this.number+"  �õ�������Ϊ��"+value);
	    }
	  }
}

//��������
//class Share {
//	  private int contents;   //��Ʒ����
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

