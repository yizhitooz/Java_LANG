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

        System.out.println("存储成功！");
    }

    public void login(File f,User u) throws IOException
    {
        String message1 = "没有储存任何用户的信息";
        String message2 = "登陆成功";
        String message3 = "账号错误:不存在ID为"+u.getSno()+"的职工";
        String message4 = "密码错误";
        if (!f.exists())
        {
            JOptionPane.showMessageDialog(null, message1, "信息消息提示框", JOptionPane.INFORMATION_MESSAGE);
        }
        FileReader inFile = new FileReader(f);
        BufferedReader in = new BufferedReader(inFile);
        if (in.readLine().equals(u.getSno()))
        {
            if (in.readLine().equals(u.getSkey()))
            {
                JOptionPane.showMessageDialog(null, message2, "信息消息提示框", JOptionPane.INFORMATION_MESSAGE);
            } else
            {
                JOptionPane.showMessageDialog(null, message4, "信息消息提示框", JOptionPane.INFORMATION_MESSAGE);
            }
        } else
        {
            JOptionPane.showMessageDialog(null, message3, "信息消息提示框", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
