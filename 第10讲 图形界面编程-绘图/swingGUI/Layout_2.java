package swingGUI;
/*
 *     ���֡���FlowLayout��ʾ
 *     1. �̳�JFrame
 *     2. ��������Ҫ�����
 *     3. ���������һ�㹹�캯���У�
 *     4. ������
 *     5. ���ô�������
 *     6. ��ʾ����
 */
import java.awt.*;
import javax.swing.*;

public class Layout_2 extends JFrame{
	//�������
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_2 frameLayout=new Layout_2();
	}
	
	//���캯��
	public Layout_2(){
		
		//�������
		jb1=new JButton("��ť1");		
		jb2=new JButton("��ť2");
		jb3=new JButton("��ť3");
		jb4=new JButton("��ť4");
		jb5=new JButton("��ť5");
		jb6=new JButton("��ť6");
		
		//��Ӹ������		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//���ò��ֹ�����
		this.setLayout(new FlowLayout(FlowLayout.LEFT));  //�����
		
		//���ô�������
		this.setTitle("��ʽ���ְ�������FlowLayout");
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //��ֹ�û��ı䴰�ڴ�С
		
		
		//��ʾ����
		this.setVisible(true);
		
		
	}

}
