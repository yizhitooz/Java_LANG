package thread.test1;

import java.util.Date;

/**
 * ��ʾ���ͨ���̳�Thread�������߳�
 */
public class Thread01 {
	public static void main(String[] args) {
		//����һ�� Cat����
		CurrentTime ct=new CurrentTime();
		
		//�����߳�
		ct.start();//start()�ᵼ��run��������		
	}
}

class CurrentTime extends Thread{
	int times=0;
	//��дrun����
	public void run(){
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

