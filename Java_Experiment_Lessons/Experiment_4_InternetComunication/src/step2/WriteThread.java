package step2;

import java.io.*;
import java.net.Socket;
import java.util.Date;

import static step2.Server.server;

public class WriteThread extends Thread
{
    Socket socket; //socket ����
    String name; //������ע���ַ���˺Ϳͻ���
    Date date = new Date();
    //public static JWindows client;//=new JWindows("�ͻ���");
    //public static JWindows server;//=new JWindows("�����");

    public WriteThread(Socket socket, String name)
    { //���췽����
        this.socket = socket; //���ݷ��������յ��Ŀͻ����׽��֡�
        this.name = name; //����˺Ϳͻ��˷ֱ�һ��name ������������
/*        if (name == "�����")
        {
            JWindows sever = new JWindows(name);
        } else if (name == "�ͻ���")
        {
            JWindows client = new JWindows(name);
        }

 */
    }

    public void run()
    { //��дThread ���еķ������߳̿�����ִ�еĴ��롣
        while (!socket.isClosed())
        {
            String msg = null; //Ҫ���͵���Ϣ
            try
            {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                msg = bufferedReader.readLine(); //�Ӽ���¼����Ϣ
                sendMsg(msg); //������Ϣ
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    //������Ϣ
    public void sendMsg(String msg)
    {
        if (msg != null)
        {
            System.out.println("��������������������������������������������������������������������");
            System.out.println("��" + date);
            msg = "" + name + ":" + msg; //��name ƴ�������ǰ��
           server.setDisplay(msg);
            System.out.println("��" + msg); //�ڿ���̨�ϴ�ӡ����
            System.out.println("��������������������������������������������������������������������");
            try
            {
                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
                printWriter.println(msg);
            } catch (IOException e)
            {
                System.out.println("�����ѹر�");
            }
        }
    }
}