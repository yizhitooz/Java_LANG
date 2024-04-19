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
    private  Socket sc = null; //客户端的套接字
    private  InputStream ips = null; 
    private  OutputStream ops = null;
    private static int pocket = 2026;
    private static String ip ="127.0.0.1"; //服务器端的ip地址，这里用的就是本机地址
    private  Customer cust = null; //customer实体类
    private boolean first = true; //判断该客户端是否是第一次给服务器端发信息
    private JTextArea ja;
    private JFrame jf;
    private JTextField jt;

	//创建用户名
    public  void customer_init(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名:");
        String name = sc.next();
        cust = new Customer(name);
    }

	//给服务器端发送消息的方法
    public void send(String str){
        try{
            ops = sc.getOutputStream();
            if(first){
                ops.write(("                  \t        "+str+'\n').getBytes());
                first = false;
            }else {
                ops.write((this.cust.getName() + "说：" + str).getBytes());
                //ja.append("我说:"+str+'\n');
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }


	//主函数入口
    public static void main(String[] args) {
        Client c = new Client();
        c.customer_init();
        try{
            c.sc = new Socket(ip,pocket); //指明服务器端的ip和端口
            c.send(c.cust.getName()+"加入聊天室，大家欢迎");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        c.init_window();
    }

	//界面初始化
    public void init_window(){
        jf = new JFrame();
        jf.setBounds(300, 100, 400, 400);
        jf.setTitle("客户端窗口");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //聊天记录显示区
        ja = new JTextArea(10, 20);
        ja.setEditable(false);
        //聊天记录输入区
        jt = new JTextField(20);
        //添加窗口监听器，实现发送消息的功能
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strSend = jt.getText();
                // 去掉空格判断长度是否为空
                if (strSend.trim().length() == 0) {
                    return;
                }
                //客户端信息strSend发送到服务器上
                jt.setText("");
                ja.append("我说："+strSend+'\n');
                send(strSend);
                //多线程接受来自服务器的消息
                new Thread(new Receive()).start();
            }
        });
        jf.add(ja, BorderLayout.CENTER);
        jf.add(jt,BorderLayout.SOUTH);
        jf.setVisible(true);
    }


	//多线程的内部类，用以接受服务器的消息
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
                        //通讯消息
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
