package swingGUI;
/*
*    ͼ���û����� - ����
*    ���ñ�����ɫ
*/
import java.awt.*;
import javax.swing.*; //����Ҫʹ��JFrame��

public class Demo2 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 window=new Demo2();
	}
	
	public Demo2(){
		this.setTitle("swing����");
		this.setSize(400, 300);
		
		//���ñ�����ɫ
		//����һ
		//this.getContentPane().setBackground(Color.black);
		
		//������
		//this.getContentPane().setVisible(false);		
		//this.setBackground(Color.black);
		
		//������
		//JPanel jp=new JPanel();
		//jp.setBackground(Color.black);
		//this.add(jp);
		
		//������
		Container con=this.getContentPane();
		con.setBackground(Color.black);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
