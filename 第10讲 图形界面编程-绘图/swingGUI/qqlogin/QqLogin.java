package swingGUI.qqlogin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class QqLogin extends JFrame{
	//�������	
	JPanel jp=null;	
	//��
	JLabel top=null;
	//��
	JPanel jp2=null;
	JPanel jp3=null;
	JPanel jp4=null;
	JTabbedPane jtp=null;//ѡ�
	JLabel jl1=null; 
	JLabel jl2=null; 
	JLabel jl3=null; 
	JTextField jtf1=null;
	JPasswordField jps=null;
	JCheckBox jcb1=null;
	JCheckBox jcb2=null;
	JButton jb1=null;
	JButton jb2=null;
	//��
	JPanel bottom=null;
	JButton jb3=null;
	JButton jb4=null;
	JButton jb5=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QqLogin qqGUI=new QqLogin();
		qqGUI.init();
		
	}
	void init(){	
		jp=new JPanel();
		
		//�������
		//����
		top=new JLabel(new ImageIcon("src/swingGUI/qqlogin/qqLogin.png"));
		//�в�
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
		jtp=new JTabbedPane();
		jl1=new JLabel("QQ����");
		jl2=new JLabel("QQ����");
		jl3=new JLabel("<html><a href='https://aq.qq.com/cn2/safe_service/my_prot'>�������뱣��</a></html>");
		jtf1=new JTextField();
		jps=new JPasswordField("******"); 
		jcb1=new JCheckBox("�����¼");
		jcb2=new JCheckBox("��ס����");
		jb1=new JButton("�������");
		jb2=new JButton("��������");
		
		//�ϲ�
		bottom=new JPanel();
		jb3=new JButton("��  ¼");
		jb4=new JButton("ȡ  ��");
		jb5=new JButton("ע����");
		
		
		//�����в�����������λ��
		jp2.setLayout(null);
		jl1.setBounds(40, 5,50,30);
		jtf1.setBounds(100,5,100,30);
		jb1.setBounds(220,5,100,30);
		jl2.setBounds(40, 40,50,30);
		jps.setBounds(100,40,100,30);
		jb2.setBounds(220, 40, 100, 30);
		jcb1.setBounds(20,80,100,30);
		jcb2.setBounds(140,80,100,30);
		jl3.setBounds(260, 80, 100, 30);
		
		//����jp3��jp4�ı�����ɫ
		jp3.setBackground(Color.BLACK);
		jp4.setBackground(Color.RED);
		
		//������
		jp2.add(jl1);
		jp2.add(jtf1);
		jp2.add(jb1);
		jp2.add(jl2);
		jp2.add(jps);
		jp2.add(jb2);
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jl3);
		
		jtp.add("QQ����",jp2);
		jtp.add("�ֻ�����",jp3);
		jtp.add("��������",jp4);
		
		bottom.add(jb3);
		bottom.add(jb4);
		bottom.add(jb5);
	
		/*
		jp.add(top,BorderLayout.NORTH);
		jp.add(jtp,BorderLayout.CENTER);
		jp.add(bottom,BorderLayout.SOUTH);
		*/
		jp.setLayout(null);
		top.setBounds(0,0,400,50);
		jtp.setBounds(0,50,400,150);
		bottom.setBounds(0,205,400,100);
		jp.add(top);
		jp.add(jtp);
		jp.add(bottom);
		this.add(jp);
		
		
		this.setIconImage(new ImageIcon("src/swingGUI/qqlogin/qq.png").getImage());
		this.setSize(400,300);
		this.setLocation(400,200);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}
