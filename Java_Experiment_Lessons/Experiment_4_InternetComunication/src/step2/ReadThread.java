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

    Socket socket; //socket ����
    Date date = new Date();
    //public static JWindows client;//=new JWindows("�ͻ���");
    //public static JWindows server;//=new JWindows("�����");

    public ReadThread(Socket socket)
    { //���췽��
        this.socket = socket; //�����������߿ͻ��˵�socket ���󴫵ݹ���
        //JWindows client = new JWindows("�ͻ���");
    }

    public void run()
    {
        while (!socket.isClosed())
        {
            String msg = readMsg(); //��ȡ��Ϣ
            if (msg != null)
            {
                System.out.println("��������������������������������������������������������������������");
                System.out.println("��"+date);
                System.out.println("��"+msg);//��ӡ��ȡ������Ϣ
                client.setDisplay(msg);
                server.setDisplay(msg);
                System.out.println("��������������������������������������������������������������������");

            }
        }
    }

    //��ȡ��Ϣ
    public String readMsg()
    {
        String msg = null;
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            msg = bufferedReader.readLine();
        } catch (IOException e)
        {
            System.out.println("�����ѹر�");
        }
        return msg;
    }
}