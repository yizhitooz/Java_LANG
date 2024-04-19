package 网络编程.TCP.demo1.server;

//package 网络编程.tcpsocket.server;

import java.net.*;
/**
 * 这是第一个服务器端程序，让它在 9999 端口监听
 * 可以接收客户端发来的数据
 * PrintWriter类
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class MyServer
{
    public static void main(String[] args)
    {
        new MyServer();
    }

    //构造函数
    public MyServer()
    {
        try
        {
            //在 9999 号端口上监听
            ServerSocket ss = new ServerSocket(9999);
            System.out.println("9999 端口监听...");

            //等待某个客户端来连接，该函数会返回一个 Socket 连接
            Socket s = ss.accept();

            //要读取 s 中传递的数据(读取客户端发送来的数据)
            InputStreamReader isr = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(isr);

            String info = br.readLine();
            System.out.println("服务器接收到:\t" + info);

            //发送信息给客户端
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            pw.println("我是服务器，已收到你发送的信息!");

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}