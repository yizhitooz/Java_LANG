package swingGUI;
/*
 *  swing��������������������ȡ�����������壬Ȼ���������������ӻ��������
 */
import java.awt.*;
import javax.swing.*;

public class Demo3_1 extends JFrame{

	//�������
	JLabel jl=null;
	JTextField jtf=null;
	JButton jb=null;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_1 jf=new Demo3_1();
	}

	public Demo3_1(){
		
		//��ȡ������������
		Container con=this.getContentPane();
		
		jl=new JLabel("�ı���");
		jtf=new JTextField(10);
		jb=new JButton("��ť");
		
		//��ӿؼ�
		//this.add(jl);     ������ʾ�����		
		con.add(jl);
		con.add(jtf);
		con.add(jb);
		
		//���ֹ���
		//con.setLayout(new GridLayout(3,1));
		
		this.setTitle("swing����");
		this.setSize(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
