package swingGUI;
/*
 *    ���ֲ��ֹ���������
 */
import java.awt.*;
import javax.swing.*;
public class LayoutCombine extends JFrame{

	//�������
	JPanel jp1,jp2;
	JButton []jbs=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LayoutCombine mulLayout=new LayoutCombine();
	}
	
	//���캯��
	public LayoutCombine(){
		//�������
		jp1=new JPanel();  //JPanelĬ��Ϊ��ʽ����
		jp2=new JPanel();
		
		jbs=new JButton[6];
		for (int i=0;i<6;i++){
			jbs[i]=new JButton(String.valueOf(i+1));
		}	
		
		//���ò���
		//this.setLayout(new BorderLayout());
		
		//������
		jp1.add(jbs[0]);
		jp1.add(jbs[1]);
		this.add(jp1, BorderLayout.NORTH);
		this.add(jbs[2],BorderLayout.CENTER);
		jp2.add(jbs[3]);
		jp2.add(jbs[4]);
		jp2.add(jbs[5]);
		this.add(jp2,BorderLayout.SOUTH);
		
		//���ô�������
		this.setTitle("���ֲ���");
		this.setSize(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //��ֹ�û��ı䴰�ڴ�С
				
				
		//��ʾ����
		this.setVisible(true);	
	}

}
