package 网络编程.UDP;



import java.io.*;
import java.net.*;

public class UdpServer {
    public static void main(String[] args) throws IOException{
    	int tries=0;
    	
        //新建一个DatagramSocket
        DatagramSocket server=null;
		
		server = new DatagramSocket(1088);
		
        //System.out.println("端口1088在监听...");
        
        //接收客户端发送来的消息
        byte[] recvBuf = new byte[100];
        DatagramPacket recvPacket = new DatagramPacket(recvBuf, recvBuf.length);
       
		server.receive(recvPacket);				
		
        String recvStr = new String(recvPacket.getData(), 0, recvPacket.getLength());
        
        System.out.println("客户端传来消息:" + recvStr);
        System.out.println("客户端端口号：" +recvPacket.getPort());
        
        //往客户端发送消息
        int port = recvPacket.getPort();  //获取远程主机端口号
        InetAddress addr = recvPacket.getAddress();
        String sendStr = "Hello ! I'm Server";
        byte[] sendBuf;
        sendBuf = sendStr.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendBuf, sendBuf.length,addr, port);
        try {
			server.send(sendPacket);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //关闭DatagramSocket
        server.close();
    }
}
