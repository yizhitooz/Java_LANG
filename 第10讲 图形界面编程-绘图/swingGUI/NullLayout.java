package swingGUI;
/*
 * --------null����--------
 * �����������Ϊnull���֣����������λ�úʹ�С������ͨ��
 * ����setBounds(int arg0, int arg1, int arg2, int arg3)
 * �������á�
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.*;
public class NullLayout extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullLayout nl=new NullLayout();
		
	}
	
	public NullLayout(){
		//�������
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JButton jb1=new JButton("button one");
		JButton jb2=new JButton("button two");
		JButton jb3=new JButton("button three");
		JButton jb4=new JButton("button four");
//		JButton jb5=new JButton("button five");	
//		JButton jb6=new JButton("button six");	
//		JButton jb7=new JButton("button seven");	
//		JButton jb8=new JButton("button eight");
//		JButton jb9=new JButton("button nine");
//		JButton jb10=new JButton("button ten");
//		JButton jb11=new JButton("button eleven");
		
		//������������Ϊ2��1�в���
		this.setLayout(new GridLayout(2,1));
		
		//�ϲ�
		jp1.setLayout(null);   //jp1����null����
		jb1.setBounds(5, 10, 160, 40);
		jb2.setBounds(200, 10, 160, 40);
		jp1.add(jb1);
		jp1.add(jb2);		
		this.add(jp1);
		
		//�²�
		jp2.setLayout(null);
		jb3.setBounds(5, 10, 180, 30);
		jb4.setBounds(200, 10, 160, 30);		
		jp2.add(jb3);
		jp2.add(jb4);
		this.add(jp2);		
		
		//���ô�������
		this.setTitle("null���ְ���");
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		//this.setResizable(false); //��ֹ�û��ı䴰�ڴ�С			
		//��ʾ����
		this.setVisible(true);
		
	}

}
