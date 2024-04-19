package ������.UDP;
/*
 * UDP Socket���
 */
import java.io.*;
import java.net.*;

public class UdpClient {
    public static void main(String[] args) throws IOException 
    {
        //�½�һ��DatagramSocket
        DatagramSocket client = new DatagramSocket();

        //������˷�����Ϣ
        String sendStr = "Hello! I'm Client";
        byte[] sendBuf;
        sendBuf = sendStr.getBytes();
        InetAddress addr = InetAddress.getByName("127.0.0.1");
        int port = 1088;
        DatagramPacket sendPacket = new DatagramPacket(sendBuf, sendBuf.length,addr, port);
        client.send(sendPacket);  //��������      
        
        //���ܷ���˴�������Ϣ
        byte[] recvBuf = new byte[100];
        DatagramPacket recvPacket = new DatagramPacket(recvBuf, recvBuf.length);

        client.receive(recvPacket);  //��������
        
        String recvStr = new String(recvPacket.getData(), 0,recvPacket.getLength());
        System.out.println("����˴�����Ϣ:" + recvStr);
        System.out.println("����˶˿ںţ�" +recvPacket.getPort());
        
        //�ر�DatagramSocket
        client.close();
    }
}
