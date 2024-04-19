package Step2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ChatWithClientTask implements Runnable
{
    Socket skt;
    DataInputStream in;
    DataOutputStream out;

    public ChatWithClientTask(Socket skt)
    {
        this.skt = skt;
        try
        {
            in = new DataInputStream(this.skt.getInputStream());
            out = new DataOutputStream(this.skt.getOutputStream());
        } catch (IOException exp)
        {
            System.out.println("�쳣:" + exp.getMessage());
        }
    }

    @Override
    public void run()
    {
        String clientMsg = null;
        try
        {
            clientMsg = in.readUTF();
            String sendMsg = null;
            String sRegx = "(������ʽ)";
            Pattern pattern = Pattern.compile(sRegx);
            Matcher matcher = pattern.matcher(clientMsg);
            if (matcher.find())
            {
                sendMsg = "������:��Ҫ˵�໰";
            } else
            {
                sendMsg = "������:�յ���Ϣ" + clientMsg;
                out.writeUTF(sendMsg);
            }
        } catch (IOException exp)
        {
            System.out.println("��д�쳣:" + exp.getMessage());
        }
    }

}

public class Server extends ChatWithClientTask
{

    public Server(int i)
    {
        super();
    }

    public void waitForClient()
    {
        System.out.println("�ȴ��ͻ�������...");
        clientSocket = serverSocket.accept();
        InetAddress addr = clientSocket.getInetAddress();
        System.out.println("�ӵ��ͻ�������:" + addr.toString());
    }

    public void processClientSession()
    {
        ChatWithClientTask task = new ChatWithClientTask(clientSocket);
        Thread thread = new Thread(task);
        System.out.println("���ڴ���ǰ�ͻ��˻Ự...");
        thread.start();
    }

    public static void main(String[] args)
    {
        Server server = null;
        while (server == null)
        {
            try
            {
                server = new Server(2022);
            } catch (Exception e)
            {
                System.out.println("�쳣" + e.getMessage());
            }
        }
        while (true)
        {
            try
            {
                server.waitForClient();
                server.processClientSession();
            } catch (Exception exp)
            {
                System.out.println("�쳣" + exp.getMessage());
            }

        }

    }

}
