package step2;

import java.io.*;
import java.net.Socket;
import java.util.Date;

import static step2.Server.server;

public class WriteThread extends Thread
{
    Socket socket; //socket 对象
    String name; //用来标注区分服务端和客户端
    Date date = new Date();
    //public static JWindows client;//=new JWindows("客户端");
    //public static JWindows server;//=new JWindows("服务端");

    public WriteThread(Socket socket, String name)
    { //构造方法。
        this.socket = socket; //传递服务器接收到的客户端套接字。
        this.name = name; //服务端和客户端分别传一个name 过来用来区分
/*        if (name == "服务端")
        {
            JWindows sever = new JWindows(name);
        } else if (name == "客户端")
        {
            JWindows client = new JWindows(name);
        }

 */
    }

    public void run()
    { //重写Thread 类中的方法，线程开启后执行的代码。
        while (!socket.isClosed())
        {
            String msg = null; //要发送的消息
            try
            {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                msg = bufferedReader.readLine(); //从键盘录入信息
                sendMsg(msg); //发送信息
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    //发送消息
    public void sendMsg(String msg)
    {
        if (msg != null)
        {
            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("┃" + date);
            msg = "" + name + ":" + msg; //将name 拼接在语句前面
           server.setDisplay(msg);
            System.out.println("┃" + msg); //在控制台上打印出来
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            try
            {
                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
                printWriter.println(msg);
            } catch (IOException e)
            {
                System.out.println("连接已关闭");
            }
        }
    }
}