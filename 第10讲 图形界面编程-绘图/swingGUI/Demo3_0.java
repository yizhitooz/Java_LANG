package swingGUI;

import java.awt.FlowLayout;
import java.awt.GridLayout;

/*
 * ��������һ����ֱ�ӽ����������ӵ�JFrame�����С�
 */

import javax.swing.*;
/*
 *  ����������������
*/
public class Demo3_0 extends JFrame{
	
	//��1���������
	JLabel jl=null;
	JTextField jtf=null;
	JButton jb=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_0 jf=new Demo3_0();
		
	}

	public Demo3_0(){
		
		//��2���������
		jl=new JLabel("�ı���");
		jtf=new JTextField(10);
		jtf.setText("������");
		jb=new JButton("ȷ��");			
		
		//��3��������
		this.add(jl);
		this.add(jtf);		
		//���⣺����ӵ��������������ӵ������
		
		//����취�����в��ֹ���
		//this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//���ô���
		this.setTitle("swing����-������");  //���ñ�����		
		this.setSize(300, 200);  //���ô����С��(����)������		
		this.setLocation(100, 100);  //���ô����ʼλ�ã��粻���ó�ʼλ�ã������ԭ��Ϊ��Ļ���Ͻ�		
		//jf.setIconImage(new ImageIcon("images/baby.jpg").getImage());   //���ñ�����ͼ��
		this.setVisible(true); //��ʾ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //�رմ����ʱ�򣬱�֤jvmҲ�˳���

	}
}
