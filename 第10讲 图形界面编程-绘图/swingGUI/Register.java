package swingGUI;

import java.awt.*;
import javax.swing.*;
public class Register extends JFrame{

	//�������
	JLabel lb1,lb2;
	JCheckBox []cb=new JCheckBox[3];;
	JRadioButton male,fmale;
	JButton jb1,jb2;
	JPanel jp1,jp2,jp3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register register=new Register();
	}

	//���캯��
	public Register(){
		
		//���ò���
		this.setLayout(new GridLayout(3,1));		
		
		//������
		//����
		jp1=new JPanel();		
		lb1=new JLabel("��ϲ�����˶�");
		cb[0]=new JCheckBox("����");
		cb[1]=new JCheckBox("����");
		cb[2]=new JCheckBox("����");
		jp1.add(lb1);
		jp1.add(cb[0]);
		jp1.add(cb[1]);
		jp1.add(cb[2]);
		this.add(jp1);
		
		//�в�
		jp2=new JPanel();
		lb2=new JLabel("����Ա�");
		male=new JRadioButton("��");
		fmale=new JRadioButton("Ů");
		//ͬһ�鵥ѡ��ť������ص�һ��ButtonGroup������
		ButtonGroup gbutton=new ButtonGroup();
		gbutton.add(male);
		gbutton.add(fmale);
		
		jp2.add(lb2);
		jp2.add(male);
		jp2.add(fmale);
		this.add(jp2);
		
		//�ײ�
		jp3=new JPanel();
		jb1=new JButton("ע���û�");
		jb2=new JButton("ȡ��ע��");
		jp3.add(jb1);
		jp3.add(jb2);
		this.add(jp3);
		
		//���ô�������
		this.setTitle("��Աע��ϵͳ");
		this.setSize(300,200);
		this.setLocation(200,140);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //��ֹ�û��ı䴰�ڴ�С
				
				
		//��ʾ����
		this.setVisible(true);		
		
	}
}
