package comm.peroners;
/*
 * һ���̶߳����ݣ�һ���߳�д���ݡ�
 * ʵ������д�����Ĺ���
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
