package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Date;

import static step2.Client.client;
import static step2.Server.server;

public class ReadThread extends Thread
{

    Socket socket; //socket 对象
    Date date = new Date();
    //public static JWindows client;//=new JWindows("客户端");
    //public static JWindows server;//=new JWindows("服务端");

    public ReadThread(Socket socket)
    { //构造方法
        this.socket = socket; //将服务器或者客户端的socket 对象传递过来
        //JWindows client = new JWindows("客户端");
    }

    public void run()
    {
        while (!socket.isClosed())
        {
            String msg = readMsg(); //读取消息
            if (msg != null)
            {
                System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("┃"+date);
                System.out.println("┃"+msg);//打印读取到的消息
                client.setDisplay(msg);
                server.setDisplay(msg);
                System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            }
        }
    }

    //读取消息
    public String readMsg()
    {
        String msg = null;
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            msg = bufferedReader.readLine();
        } catch (IOException e)
        {
            System.out.println("连接已关闭");
        }
        return msg;
    }
}