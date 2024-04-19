package swingGUI;
/*
 * ���ֹ���������BoxLayout
 */
import java.awt.*;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout_4 extends JFrame{

	//�������
	JButton []jbs=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_4 frameLayout=new Layout_4();
	}
	
	//���캯��
	public Layout_4(){
		
		jbs=new JButton[10];
		//�������
		for (int i=0;i<10;i++){
			jbs[i]=new JButton(String.valueOf(i+1));
		}		
				
		//��Ӹ������		
		for (int i=0;i<10;i++){
			this.add(jbs[i]);
			this.add(Box.createVerticalStrut(2));  //��ֱ������������
		}				
				
		//���ò��ֹ�����
		//ʵ����һ��BoxLayout���ֹ���������
		BoxLayout layout=new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS);		//BoxLayout���췽���ĵ�һ����������ʹ�øò��ֵ��������ڶ�������ָ����ˮƽ���л��Ǵ�ֱ���С�
		this.setLayout(layout);  //���������Ĳ���		
		
		//���ô�������
		this.setTitle("��ʽ���ְ�������BoxLayout");
		this.setSize(350,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		//this.setResizable(false); //��ֹ�û��ı䴰�ڴ�С		
		
		//��ʾ����
		this.setVisible(true);		
	}	

}
/*
 * BoxLayout ������ Box ������������һ��ʹ�ã���ô���������ǣ�BoxLayout �ǰѿؼ���ˮƽ���ߴ�ֱ�ķ���һ����һ���ķ��ã����Ҫ������Щ�ؼ�֮��Ŀռ䣬�ͻ���Ҫʹ�� Box �����ṩ��͸���������Ϊ��������ؼ�֮��Ŀռ䣬�Ӷ��ﵽ�����ؼ�֮��ļ���ռ��Ŀ�ġ�Box �����ṩ�� 4 ��͸����������ֱ��� rigid area��strut��glue��filler��Box �����ֱ��ṩ�˲�ͬ�ķ�����������Щ��������ĸ�������ص����£�
Rigid area ��һ���û����Զ���ˮƽ�ʹ�ֱ�ߴ��͸�������
strut �� rigid area ���ƣ������û�ֻ�ܶ���һ������ĳߴ磬��ˮƽ������ߴ�ֱ���򣬲���ͬʱ����ˮƽ�ʹ�ֱ�ߴ磻
���û��� glue ���������ؼ�֮��ʱ�����ᾡ���ܵ�ռ�������ؼ�֮��Ķ���ռ䣬�Ӷ��������ؼ��������ߣ�
Filler �� Box ���ڲ��࣬���� rigid area ���ƣ�������ָ��ˮƽ���ߴ�ֱ�ĳߴ磬����������������С���������ȳߴ硣
 * 
 */
