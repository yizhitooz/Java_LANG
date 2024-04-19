package ������.TCP.demo2;


/** ��˫�����ͻ��������˽��п���̨���뽻��
 *             �����Դ����
 * ���ܣ���һ���������ˣ���9999�˿��ϼ���
 * ����ͨ������̨,������͸��ͻ��˵���Ϣ
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class MyServer2 {
	InputStreamReader isr,isr2;
	BufferedReader br,br2;
	PrintWriter pw;
	
	public static void main(String[] args) {
		new MyServer2();
	}

	//���캯��
	public MyServer2(){
		try {
			//��9999�Ŷ˿��ϼ���
			System.out.println("�ڶ˿�9999�ϼ���");
			ServerSocket ss=new ServerSocket(9999);
			//�ȴ��ͻ������ӣ��ú����᷵��һ��Socket����
			Socket s=ss.accept();
			//Ҫ��ȡs�д��ݵ�����
			isr=new InputStreamReader(s.getInputStream());
			br=new BufferedReader(isr);
			
			pw=new PrintWriter(s.getOutputStream(),true);
			
			//���մӿ���̨�������Ϣ
			isr2=new InputStreamReader(System.in);
			br2=new BufferedReader(isr2);
			while(true){
				//���տͻ�����Ϣ
				String infoFromClient=br.readLine();
				System.out.println("���������յ�:\t"+infoFromClient);
				//���մӿ���̨�������Ϣ
				System.out.println("������Ҫ���͵��ͻ��˵���Ϣ��");
				String response=br2.readLine();
				//�������ӿ���̨�Ͻ���bye���������˳�
				if(response.equals("bye")){
					System.out.println("�˳��Ի�");
					s.close();
					break;
				}
				//�Ѵӿ���̨�������Ϣ�����͸��ͻ���
				pw.println(response);
			}
		} catch (IOException e) {
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

