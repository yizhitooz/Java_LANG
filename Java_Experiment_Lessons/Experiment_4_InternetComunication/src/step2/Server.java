package step2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static JWindows server=new JWindows("�����");
    public static void main(String[] args) throws IOException
    {
        ServerSocket serverSocket = null;
        serverSocket = new ServerSocket(20000);
        Socket socket = serverSocket.accept();
//��socket ��ȡ���ݵ��߳�
        WriteThread writeThread = new WriteThread(socket, "�����");
//��socket д�����ݵ��߳�
        ReadThread readThread = new ReadThread(socket);
        writeThread.start();
        readThread.start();
    }
}
