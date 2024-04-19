package Internet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    private  Socket sc = null; //�ͻ��˵��׽���
    private  InputStream ips = null; 
    private  OutputStream ops = null;
    private static int pocket = 2026;
    private static String ip ="127.0.0.1"; //�������˵�ip��ַ�������õľ��Ǳ�����ַ
    private  Customer cust = null; //customerʵ����
    private boolean first = true; //�жϸÿͻ����Ƿ��ǵ�һ�θ��������˷���Ϣ
    private JTextArea ja;
    private JFrame jf;
    private JTextField jt;

	//�����û���
    public  void customer_init(){
        Scanner sc = new Scanner(System.in);
        System.out.print("����������:");
        String name = sc.next();
        cust = new Customer(name);
    }

	//���������˷�����Ϣ�ķ���
    public void send(String str){
        try{
            ops = sc.getOutputStream();
            if(first){
                ops.write(("                  \t        "+str+'\n').getBytes());
                first = false;
            }else {
                ops.write((this.cust.getName() + "˵��" + str).getBytes());
                //ja.append("��˵:"+str+'\n');
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }


	//���������
    public static void main(String[] args) {
        Client c = new Client();
        c.customer_init();
        try{
            c.sc = new Socket(ip,pocket); //ָ���������˵�ip�Ͷ˿�
            c.send(c.cust.getName()+"���������ң���һ�ӭ");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        c.init_window();
    }

	//�����ʼ��
    public void init_window(){
        jf = new JFrame();
        jf.setBounds(300, 100, 400, 400);
        jf.setTitle("�ͻ��˴���");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //�����¼��ʾ��
        ja = new JTextArea(10, 20);
        ja.setEditable(false);
        //�����¼������
        jt = new JTextField(20);
        //��Ӵ��ڼ�������ʵ�ַ�����Ϣ�Ĺ���
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strSend = jt.getText();
                // ȥ���ո��жϳ����Ƿ�Ϊ��
                if (strSend.trim().length() == 0) {
                    return;
                }
                //�ͻ�����ϢstrSend���͵���������
                jt.setText("");
                ja.append("��˵��"+strSend+'\n');
                send(strSend);
                //���߳̽������Է���������Ϣ
                new Thread(new Receive()).start();
            }
        });
        jf.add(ja, BorderLayout.CENTER);
        jf.add(jt,BorderLayout.SOUTH);
        jf.setVisible(true);
    }


	//���̵߳��ڲ��࣬���Խ��ܷ���������Ϣ
    class Receive implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    InputStream ips = sc.getInputStream();
                    int len;
                    byte[] b = new byte[1024];
                    String str = null;
                    while((len=ips.read(b))!=-1){
                        str = new String(b);
                        //ͨѶ��Ϣ
                        ja.append(str+'\n');
                    }
                }
            } catch (SocketException e) {
                 e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
