package Test;

import javax.swing.*;
import java.io.*;

public class User
{
    private String Sno;
    private String Skey;

    public String getSno()
    {
        return Sno;
    }

    public void setSno(String sno)
    {
        Sno = sno;
    }

    public String getSkey()
    {
        return Skey;
    }

    public void setSkey(String skey)
    {
        Skey = skey;
    }

    public void register(File f) throws IOException
    {
        if (!f.exists())
        {
            f.createNewFile();
        }
        FileWriter tofile = new FileWriter(f);
        BufferedWriter out = new BufferedWriter(tofile);

        out.write(this.getSno());
        out.newLine();
        out.write(this.getSkey());
        //tofile.close();
        out.close();

        System.out.println("�洢�ɹ���");
    }

    public void login(File f,User u) throws IOException
    {
        String message1 = "û�д����κ��û�����Ϣ";
        String message2 = "��½�ɹ�";
        String message3 = "�˺Ŵ���:������IDΪ"+u.getSno()+"��ְ��";
        String message4 = "�������";
        if (!f.exists())
        {
            JOptionPane.showMessageDialog(null, message1, "��Ϣ��Ϣ��ʾ��", JOptionPane.INFORMATION_MESSAGE);
        }
        FileReader inFile = new FileReader(f);
        BufferedReader in = new BufferedReader(inFile);
        if (in.readLine().equals(u.getSno()))
        {
            if (in.readLine().equals(u.getSkey()))
            {
                JOptionPane.showMessageDialog(null, message2, "��Ϣ��Ϣ��ʾ��", JOptionPane.INFORMATION_MESSAGE);
            } else
            {
                JOptionPane.showMessageDialog(null, message4, "��Ϣ��Ϣ��ʾ��", JOptionPane.INFORMATION_MESSAGE);
            }
        } else
        {
            JOptionPane.showMessageDialog(null, message3, "��Ϣ��Ϣ��ʾ��", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
