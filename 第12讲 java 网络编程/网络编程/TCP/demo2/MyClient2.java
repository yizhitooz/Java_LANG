package ������.TCP.demo2;


/**           �ͻ���Դ����
 * ����һ���ͻ��˳��򣬿������ӷ������˿�9999
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class MyClient2 {
	InputStreamReader isr,isr2;
	BufferedReader br,br2;
	PrintWriter pw;
	
	public static void main(String[] args) {
		new MyClient2();
	}
	
	public MyClient2(){
		try {
			//���ӷ�������
			Socket s=new Socket("127.0.0.1",9999);
			
			pw=new PrintWriter(s.getOutputStream(),true);
			//����̨������Ϣ
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			
			//�ӷ�����������Ϣ
			isr2=new InputStreamReader(s.getInputStream());
			br2=new BufferedReader(isr2);
			
			while(true){
				//�ͻ����ȴӿ���̨����
				String info=br.readLine();
				//Ȼ���͸�������
				pw.println(info);
				//�ͻ��˴ӿ���̨������byebye��Ϣ���ͻ����˳�
				if(info.equals("byebye")){
					System.out.println("�ͻ����˳��Ի�");
					s.close();
					break;
				}
				
				//���մӷ�������������Ϣ
				String res=br2.readLine();
				System.out.println("�ͻ��˽��յ�����Ϣ��"+res);
				//�ͻ��˽��շ���˷�������byebye��Ϣ���ͻ����˳�
				if(res.equals("byebye")){
					System.out.println("��������ǿ�ƿͻ����˳��Ի�");
					s.close();
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(br2!=null) br2.close();
				if(isr2!=null) isr2.close();
				if(pw!=null) pw.close();
				if(br!=null) br.close();
				if(isr!=null) isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
