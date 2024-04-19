package employeeinfo;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame
{
    JLabel jlTitle = null;
    //JLabel jlTitle2=null;
    //JLabel jlTitle3=null;
    JButton jbAppend = null;
    JButton jbView = null;

    JPanel jp = null;
    //JPanel jp1 = null;
    //JPanel jp2 = null;
    //JPanel jp3 = null;

    public MainWindow()
    {
        System.out.println("������");
        jlTitle = new JLabel(new ImageIcon("src/employeeinfo/Title.png"));

        jbAppend = new JButton("���");
        jbView = new JButton("���");


        jp = new JPanel();

        jp.setLayout(null);
        jlTitle.setBounds(0, 0, 400, 100);
        jbAppend.setBounds(30, 180, 140, 40);
        jbView.setBounds(200, 180, 140, 40);

        jp.add(jlTitle);
        jp.add(jbAppend);
        jp.add(jbView);

        jp.setBackground(Color.WHITE);

        jbAppend.addActionListener(new Listeners());
        jbView.addActionListener(new Listeners());

        this.add(jp);
        this.setTitle("ʵ���� ְ����Ϣ����ϵͳ ");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null); //���ô��������ʾ

        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
