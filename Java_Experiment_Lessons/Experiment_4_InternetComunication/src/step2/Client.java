package step2;

import java.io.IOException;
import java.net.Socket;

public class Client extends Thread
{
    public static JWindows client=new JWindows("�ͻ���");
    public static void main(String[] args) throws IOException
    {
        Socket socket = new Socket("127.0.0.1", 20000);
        //��socket ��ȡ���ݵ��߳�
        WriteThread writeThread = new WriteThread(socket, "�ͻ���");
        //��socket д�����ݵ��߳�
        ReadThread readThread = new ReadThread(socket);
        writeThread.start();
        readThread.start();
    }
}