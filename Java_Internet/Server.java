package Internet;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class Server {
	
    private  ServerSocket ss = null; //����ָ���������Ķ˿ںźͽ������Կͻ��˵���Ϣ
    private  Socket sc =null; //���������׽���
    private static int pocket = 2026; //�˿ں�
    private  InputStream ips = null; //�����
    private  boolean start = false; //�жϷ������Ƿ�����
    private static JFrame jf = new JFrame(); //GUI����
    private static JTextArea ja = new JTextArea(10, 20); //GUI����
    private ArrayList<Thread_server> ccList = new ArrayList<Thread_server>(); //�����������洢�ͻ���


    //���������
    public static void main(String[] args) {
        Server s = new Server();
        s.init_gui(); //��ʼ��GUI����
        s.getmassage(); //�������˵õ���Ϣ��Ĳ���
    }


	//��ʼ��GUI����
    public static void init_gui(){
        jf.setBounds(300, 300, 400, 400);
        jf.setTitle("����������");
        //����Ϊ���ɱ༭
        ja.setEditable(false);
        ja.append("		�������ɹ����У�\n");
        //������
        jf.add(ja);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        System.out.println("�������ɹ�����");
    }

	//�������˵õ���Ϣ��Ĳ���
    public  void getmassage(){
        try{
   			//ָ���������˵Ķ˿ںŲ������������˵�socket
            ss = new ServerSocket(pocket); 
            start = true;//�������Ѿ���
            //��ΪҪʵ�ֶ������죬�����Ҫѭ�������ͻ���
            while(start){
                sc = ss.accept(); //���������׽��ֺͿͻ��˵��׽�������
                System.out.println("һ���ͻ����Ѽ������ӣ�"+sc.getPort()); //��ӡ��Ϣ
                ja.append("��������Ϣ��һ���ͻ������ӷ�����" + sc.getInetAddress() + "/" + sc.getPort()+'\n'); //GUI�����д�ӡ��Ϣ
                //��Ϊ���ܴ����ж���ͻ������ӣ������Ҫ�������߳���ʵ��
                Thread_server ts = new Thread_server(sc);
                ccList.add(ts); //�ü���������ͻ��˵�socket
                ts.start(); //�̵߳�����
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(ss!=null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(sc!=null){
                try {
                    sc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ips!=null){
                try {
                    ips.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    //�������̵߳��ڲ���
      class Thread_server extends Thread{
        Socket sc = null;

        public Thread_server(Socket sc){
            this.sc = sc;
        }

        @Override
        //�������˽��ܲ��������Կͻ��˵���Ϣ
        public void run() {
            InputStream ips = null;
            try{
                ips = sc.getInputStream();
                byte[] b = new byte[1024];
                int len;
                String str = null;
                while((len=ips.read(b))!=-1){
                    str = new String(b);
                    System.out.println(str);
                    ja.append(str+'\n');

					//�������˸����еĿͻ��˷�����Ϣ
                    Iterator<Thread_server> iterator = ccList.iterator();
                    while (iterator.hasNext() && ccList.size()>=2) {
                        Thread_server th = iterator.next();
                        if(th.sc != sc){
                            th.sendmassage(str); //������Ϣ�ĺ���
                        }
                    }
                    //��ʼ��byte[] ����
                    for(int i = 0 ; i<1024 ; i++){
                        b[i]=0;
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                try {
                    ips.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //�������˸�ÿ���ͻ��˷�����Ϣ
        public void sendmassage(String str){
            OutputStream ops = null;
            try {
                ops = sc.getOutputStream();
                ops.write(str.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
