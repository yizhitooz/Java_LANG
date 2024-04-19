package swingGUI;
/*
 *     ���֡���BorderLayout��ʾ
 *     1. �̳�JFrame
 *     2. ��������Ҫ�����
 *     3. ���������һ�㹹�캯���У�
 *     4. ������
 *     5. ���ô�������
 *     6. ��ʾ����
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

import com.sun.java.swing.plaf.windows.resources.windows;
//import javax.swing.event.*;

public class Layout_1 extends JFrame{
	//�������
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_1 frameLayout=new Layout_1();
	}
	
	//���캯��
	public Layout_1(){
		
		//��ȡswing�����񣬲�һһ��ӡ����
		UIManager.LookAndFeelInfo []info=UIManager.getInstalledLookAndFeels();		
		for(UIManager.LookAndFeelInfo tem:info)
		{
		   System.out.println(tem.getClassName());
		}
		
		//����swing������
		String windows="com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
		//String windows="javax.swing.plaf.nimbus.NimbusLookAndFeel";
		//String windows="javax.swing.plaf.metal.MetalLookAndFeel";
		//String windows="com.sun.java.swing.plaf.motif.MotifLookAndFeel";
		//String windows="com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		try {
			UIManager.setLookAndFeel(windows);
			//SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		//�������
		jb1=new JButton("�в�");
		jb2=new JButton("����");
		jb3=new JButton("����");
		jb4=new JButton("�ϲ�");
		jb5=new JButton("����");
		
		jb6=new JButton("�в�2");
		
		//��Ӹ������		
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2, BorderLayout.NORTH);
		this.add(jb3, BorderLayout.EAST);
		this.add(jb4,BorderLayout.SOUTH);
		this.add(jb5,BorderLayout.WEST);
		
		this.add(jb6, BorderLayout.CENTER);
		
		//���ô�������
		this.setTitle("�߽粼�ְ�������BorderLayout");
		this.setSize(400,300);
		
		//��ʾ����
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
