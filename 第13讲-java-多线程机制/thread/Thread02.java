package thread.test1;

import java.util.Date;

/**
 * ��ʾ���ͨ��Runnable�ӿ��������߳�
 */
public class Thread02{
	public static void main(String []args){
		CurrentTime ct=new CurrentTime();
		//�����߳�
		Thread t=new Thread(ct);
		//�����߳�
		t.start();
	}
}
class CurrentTime implements Runnable{//����Runnable�ӿ�
	public void run(){
		int times=0;
		while(true){
			//����һ��
			//1000��ʾ1000����
			try {
				Thread.sleep(5000);//sleep�ͻ��ø��߳̽��뵽Sleep״̬,���ͷ���Դ��
			} catch (Exception e) {
				e.printStackTrace();
			}
			times++;
			Date dt=new Date();//��ȡ��ǰ����
			System.out.println(dt.toString());
			if(times==5){
				//�˳��߳�
				break;
			}
		}
	}
}
