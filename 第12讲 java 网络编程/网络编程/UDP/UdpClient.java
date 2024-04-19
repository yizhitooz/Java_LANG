package 网络编程.UDP;
/*
 * UDP Socket编程
 */
import java.io.*;
import java.net.*;

public class UdpClient {
    public static void main(String[] args) throws IOException 
    {
        //新建一个DatagramSocket
        DatagramSocket client = new DatagramSocket();

        //往服务端发送消息
        String sendStr = "Hello! I'm Client";
        byte[] sendBuf;
        sendBuf = sendStr.getBytes();
        InetAddress addr = InetAddress.getByName("127.0.0.1");
        int port = 1088;
        DatagramPacket sendPacket = new DatagramPacket(sendBuf, sendBuf.length,addr, port);
        client.send(sendPacket);  //发送数据      
        
        //接受服务端传来的消息
        byte[] recvBuf = new byte[100];
        DatagramPacket recvPacket = new DatagramPacket(recvBuf, recvBuf.length);

        client.receive(recvPacket);  //接收数据
        
        String recvStr = new String(recvPacket.getData(), 0,recvPacket.getLength());
        System.out.println("服务端传来消息:" + recvStr);
        System.out.println("服务端端口号：" +recvPacket.getPort());
        
        //关闭DatagramSocket
        client.close();
    }
}
