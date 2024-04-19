package comm.peroners;
/*
 * 一个线程读数据，一个线程写数据。
 * 实现轮流写、读的功能
 */
public class ThreadCommunicate {
	  public static void main(String[] args) {
	    Person s=new Person();	   
	    Write w=new Write(s);
	    Read r=new Read(s);
	    w.start();
	    r.start();
	  }
}
