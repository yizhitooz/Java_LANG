package Test;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MyJFrame extends JFrame
{
    JLabel jl_sno = new JLabel("�û���");
    JTextField jtf_sno = new JTextField(15);
    JLabel jl_key = new JLabel("����");
    JTextField jtf_key = new JTextField(15);

    JButton jb_register = new JButton("ע��");
    JButton jb_login = new JButton("��¼");

    MyJFrame(String title, int width, int height)
    {
        setTitle(title);
        setSize(width, height);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        p1.add(jl_sno);
        p1.add(jtf_sno);
        JPanel p2 = new JPanel();
        p2.add(jl_key);
        p2.add(jtf_key);
        jb_register.addActionListener(e ->
                {
                    File f = new File("ѧ��.txt");
                    User u = new User();
                    u.setSno(jtf_sno.getText());
                    u.setSkey(jtf_key.getText());
                    System.out.println(u.getSno());
                    System.out.println(u.getSkey());
                    //�ж������Ƿ�Ϲ�
                    Boolean condition1 = false;
                    Boolean condition2 = false;
                    Boolean condition3 = false;
                    for (int i = 0; i < u.getSkey().length(); i++)
                    {
                        if (u.getSkey().indexOf(i) >= 'A' || u.getSkey().indexOf(i) <= 'Z')
                        {
                            condition1 = true;
                        }
                        if (u.getSkey().indexOf(i) >= 'a' || u.getSkey().indexOf(i) <= 'z')
                        {
                            condition2 = true;
                        }
                        if (u.getSkey().indexOf(i) >= '0' || u.getSkey().indexOf(i) <= '9')
                        {
                            condition3 = true;
                        }
                    }
                    //System.out.println(condition1);
                    //System.out.println(condition2);
                    //System.out.println(condition3);
                    if (condition3 && condition2 && condition1)
                    {
                        try
                        {
                            u.register(f);
                            JOptionPane.showMessageDialog(null, "ע��ɹ�!", "��Ϣ��Ϣ��ʾ��", JOptionPane.INFORMATION_MESSAGE);
                        } catch (IOException ex)
                        {
                            throw new RuntimeException(ex);
                        }
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "���벻����Ҫ��", "��Ϣ��Ϣ��ʾ��", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
        );
        jb_login.addActionListener(e ->
        {
            File f = new File("ѧ��.txt");
            User u = new User();
            u.setSno(jtf_sno.getText().replace("\n", ""));
            u.setSkey(jtf_key.getText());
            try
            {
                u.login(f,u);
            } catch (IOException ex)
            {
                throw new RuntimeException(ex);
            }
            jtf_sno.setText(null);
            jtf_key.setText(null);
        });
        JPanel p3 = new JPanel();
        p3.add(jb_register);
        p3.add(jb_login);
        add(p1);
        add(p2);
        add(p3);
        setVisible(true);
    }
}
