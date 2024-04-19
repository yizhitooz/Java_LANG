package thread.test1;
/**
 * 线程的优先级
 * @author lyh
 *
 */
public class Thread04 extends Thread{	
  public static void main (String args[]) {
	Thread04[] t=new Thread04[4];
	for(int i=0;i<4;i++) 
		t[i]=new Thread04();
	t[1].setPriority(Thread.MIN_PRIORITY);
	t[3].setPriority(MAX_PRIORITY);
	for(int i=0;i<4;i++) 
		t[i].start();
  }
  public void run() {
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println(getName()+"线程的优先级是 "+getPriority()+" 已计算完毕!");
  }
}


