package step2;

import java.io.IOException;
import java.net.Socket;

public class Client extends Thread
{
    public static JWindows client=new JWindows("客户端");
    public static void main(String[] args) throws IOException
    {
        Socket socket = new Socket("127.0.0.1", 20000);
        //从socket 读取数据的线程
        WriteThread writeThread = new WriteThread(socket, "客户端");
        //往socket 写入数据的线程
        ReadThread readThread = new ReadThread(socket);
        writeThread.start();
        readThread.start();
    }
}