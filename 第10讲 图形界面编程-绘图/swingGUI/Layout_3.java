package swingGUI;
/*
 *     ���֡���GridLayout��ʾ
 *     1. �̳�JFrame
 *     2. ��������Ҫ�����
 *     3. ���������һ�㹹�캯���У�
 *     4. ������
 *     5. ���ô�������
 *     6. ��ʾ����
 */
import java.awt.*;
import javax.swing.*;

public class Layout_3 extends JFrame{
	//�������
	JButton []jbs=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_3 frameLayout=new Layout_3();
	}
	
	//���캯��
	public Layout_3(){
		
		jbs=new JButton[9];
		//�������
		for (int i=0;i<9;i++){
			jbs[i]=new JButton(String.valueOf(i+1));
		}	
		
		//��Ӹ������		
		for (int i=0;i<9;i++){
			this.add(jbs[i]);
		}
		
		//���ò��ֹ�����
		this.setLayout(new GridLayout(3,3,4,4));  //����3��3������
		
		//���ô�������
		this.setTitle("���񲼾ְ�������GridLayout");
		this.setSize(500,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //��ֹ�û��ı䴰�ڴ�С
		
		
		//��ʾ����
		this.setVisible(true);		
	}		
}
