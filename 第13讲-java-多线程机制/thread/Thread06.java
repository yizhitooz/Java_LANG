//package thread;
///*
// * �̣߳�5��
// * ��ʾ ���ַ��������̵߳�����
// * �ó�����һ������Ʊ����ϵͳ��         
// * �ѽ��ʵ�����ݹ�������     
// * synchronized(this){  
//		//ͬ�������
//   }	
// */
//public class Thread06 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub		
//		
//		TicketWindow w1=new TicketWindow();
//		
//		//�����̹߳���ͬһ�δ���
//		Thread t1=new Thread(w1);
//		Thread t2=new Thread(w1);
//		Thread t3=new Thread(w1);
//		t1.start();
//		t2.start();
//		t3.start();		
//	}    
//}
//
////��Ʊ������
////��Ϊһ���̣߳�Ŀ���ǲ�ͣ��Ʊ
//class TicketWindow implements Runnable{
//	private int totalTickets=10;
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		while (true){
//			synchronized(this){
//				if (totalTickets>=1){
//					try {
//						Thread.sleep(1000);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()+"��ǰ�ڳ��۵�"+totalTickets+"��Ʊ");
//					totalTickets--;
//				}
//				else break;
//			}			
//		}//while
//	}	
//}