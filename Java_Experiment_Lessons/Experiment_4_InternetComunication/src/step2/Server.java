package step2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static JWindows server=new JWindows("服务端");
    public static void main(String[] args) throws IOException
    {
        ServerSocket serverSocket = null;
        serverSocket = new ServerSocket(20000);
        Socket socket = serverSocket.accept();
//从socket 读取数据的线程
        WriteThread writeThread = new WriteThread(socket, "服务端");
//往socket 写入数据的线程
        ReadThread readThread = new ReadThread(socket);
        writeThread.start();
        readThread.start();
    }
}
