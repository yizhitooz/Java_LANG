//package Work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    public static void main(String args[])
    {
        MyFrame mf = new MyFrame("�������������", 100, 100, 1000, 750);
        JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout());
        JLabel[] jl = {new JLabel("��A:"), new JLabel("��B:"), new JLabel("��C:")};
        JTextField jtf1 = new JTextField(15);
        JTextField jtf2 = new JTextField(15);
        JTextField jtf3 = new JTextField(15);
        JButton jb = new JButton("�������");
        jp.add(jl[0]);
        jp.add(jtf1);
        jp.add(jl[1]);
        jp.add(jtf2);
        jp.add(jl[2]);
        jp.add(jtf3);
        jp.add(jb);
        mf.add(jp, BorderLayout.NORTH);
        JTextArea jta = new JTextArea();
        mf.add(jta, BorderLayout.CENTER);
        TriAngle tri = new TriAngle();
        tri.setJButton(jb);
        tri.setJTextArea(jta);
        tri.setValue(jtf1, jtf2, jtf3);
        jb.addActionListener(tri);
        mf.setVisible(true);
    }
}

class MyFrame extends JFrame
{
    MyFrame(String s, int x, int y, int z, int h)
    {
        setTitle(s);
        setLayout(new BorderLayout());
        setBounds(x, y, z, h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

class TriAngle implements ActionListener
{
    double a;
    double b;
    double c;
    double p;
    JButton jbu;
    JTextArea jea;
    JTextField jtd1;
    JTextField jtd2;
    JTextField jtd3;

    void setValue(JTextField a, JTextField b, JTextField c)
    {
        jtd1 = a;
        jtd2 = b;
        jtd3 = c;//��������������ʽ���λᱨ��
    }

    double setArea()
    {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    void setJButton(JButton j)
    {
        jbu = j;
    }

    void setJTextArea(JTextArea j)
    {
        jea = j;
    }

    public void actionPerformed(ActionEvent e)
    {
        this.a = Double.parseDouble(jtd1.getText());
        this.b = Double.parseDouble(jtd2.getText());
        this.c = Double.parseDouble(jtd3.getText());//JTextField������Ϊ�ַ�������Ҫת����double��ֻ����actionPerformed��ת����ֻ�������Ų������
        p = (a + b + c) / 2;
        if (a + b > c && a + c > b && b + c > a)
        {
            jea.append("������" + a + " " + b + " " + c + "�����:" + setArea() + "\n");
        } else
        {
            jea.append("������" + a + " " + b + " " + c + "�����:�޷��������" + "\n");
        }
    }
}