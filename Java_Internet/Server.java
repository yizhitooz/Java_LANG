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
	
    private  ServerSocket ss = null; //用以指明服务器的端口号和接受来自客户端的信息
    private  Socket sc =null; //服务器的套接字
    private static int pocket = 2026; //端口号
    private  InputStream ips = null; //输出流
    private  boolean start = false; //判断服务器是否启动
    private static JFrame jf = new JFrame(); //GUI界面
    private static JTextArea ja = new JTextArea(10, 20); //GUI界面
    private ArrayList<Thread_server> ccList = new ArrayList<Thread_server>(); //构造容器来存储客户端


    //主函数入口
    public static void main(String[] args) {
        Server s = new Server();
        s.init_gui(); //初始化GUI界面
        s.getmassage(); //服务器端得到信息后的操作
    }


	//初始化GUI界面
    public static void init_gui(){
        jf.setBounds(300, 300, 400, 400);
        jf.setTitle("服务器窗口");
        //设置为不可编辑
        ja.setEditable(false);
        ja.append("		服务器成功运行！\n");
        //添加组件
        jf.add(ja);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        System.out.println("服务器成功运行");
    }

	//服务器端得到信息后的操作
    public  void getmassage(){
        try{
   			//指明服务器端的端口号并创建服务器端的socket
            ss = new ServerSocket(pocket); 
            start = true;//服务器已经打开
            //因为要实现多人聊天，因此需要循环监听客户端
            while(start){
                sc = ss.accept(); //服务器的套接字和客户端的套接字连接
                System.out.println("一个客户端已加入连接："+sc.getPort()); //打印消息
                ja.append("服务器信息：一个客户端连接服务器" + sc.getInetAddress() + "/" + sc.getPort()+'\n'); //GUI界面中打印消息
                //因为可能存在有多个客户端连接，因此需要创建多线程来实现
                Thread_server ts = new Thread_server(sc);
                ccList.add(ts); //用集合来储存客户端的socket
                ts.start(); //线程的启动
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



    //创建多线程的内部类
      class Thread_server extends Thread{
        Socket sc = null;

        public Thread_server(Socket sc){
            this.sc = sc;
        }

        @Override
        //服务器端接受并反馈来自客户端的信息
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

					//服务器端给所有的客户端发送消息
                    Iterator<Thread_server> iterator = ccList.iterator();
                    while (iterator.hasNext() && ccList.size()>=2) {
                        Thread_server th = iterator.next();
                        if(th.sc != sc){
                            th.sendmassage(str); //发送消息的函数
                        }
                    }
                    //初始化byte[] 数组
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

        //服务器端给每个客户端发送消息
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
