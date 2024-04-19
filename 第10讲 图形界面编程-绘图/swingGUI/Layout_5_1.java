package swingGUI;
import java.awt.Color;
import java.awt.Font;
/*
 * ���ֹ�����-GridBagLayout
 * �ڡ�Layout_5_0.java"�У���Ҫ����ظ�����GridBagConstraints�ĸ����ԣ�
 * Ϊ�˼��ٴ�����д�����Զ���һ����������GridBagLayout�����У�GridBagConstraints�ĸ����Ե�����:
 * ��������ķ���   add(JComponent c,GridBagConstraints gbc,int x,int y,int width,int height) 
 */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javafx.scene.layout.Border;

public class Layout_5_1 extends JPanel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_5_1 jp=new Layout_5_1();
		JFrame jf=new JFrame();
		//���ô�������
		jf.setTitle("�߽粼�ְ�������GridBagLayout");
		jf.setSize(600,400);
		
		//��ʾ����
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(jp);
	}
	
	public void add(JComponent c,GridBagConstraints gbc,int x,int y,int width,int height){
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=width;
		gbc.gridheight=height;
		super.add(c, gbc);		
	}
	
	public Layout_5_1(){
		//�������߿�
		javax.swing.border.Border loweredBevelBorder=BorderFactory.createLoweredBevelBorder();
		javax.swing.border.Border lineBorder=BorderFactory.createLineBorder(Color.RED);
						
		GridBagConstraints gbc=new GridBagConstraints();		
		GridBagLayout gb=new GridBagLayout();
		
		//�������
		JButton jb1=new JButton("button one");
		JButton jb2=new JButton("button two");
		JButton jb3=new JButton("button three");
		JButton jb4=new JButton("button four");
		JButton jb5=new JButton("button five");	
		JButton jb6=new JButton("button six");	
		JButton jb7=new JButton("button seven");	
		JButton jb8=new JButton("button eight");
		JButton jb9=new JButton("button nine");
		JButton jb10=new JButton("button ten");
		JButton jb11=new JButton("button eleven");
		
				//(1)������������GridBagLayout����
		this.setLayout(gb);  		
		
				//(2)����GridBagConstraints�ĸ����ԣ�
		
		gbc.fill=GridBagConstraints.BOTH;
		//gbc.weightx=1;  //���򰴱������Ų���������������������Ĵ�С�������Ŵ��ڵĴ�С�仯���仯��
		//gbc.weighty=1;  //���򰴱������Ų���������������������Ĵ�С�������Ŵ��ڵĴ�С�仯���仯��
		gbc.anchor=GridBagConstraints.SOUTH;		//anchor: ����ڵ�Ԫ���еĶ��뷽ʽ
				
		        //(3)����������һ����������ӵ�������ƣ��ڶ��������Ǹ����ʹ�õĲ��֣���dBagConstraints���趨����
		this.add(jb1,gbc,0,0,1,1);
		this.add(jb2,gbc,1,0,1,1);
		this.add(jb3,gbc,GridBagConstraints.RELATIVE,0,1,1);  //gridx��ֵΪGridBagConstraints.RELATIVEʱ������ӵ����������ǰһ��������Ҳ�
		//jb4����ռ��������ʣ�൥Ԫ��
		this.add(jb4,gbc,3,0,GridBagConstraints.REMAINDER,1);
		
		this.add(jb5,gbc,0,1,2,1);
		this.add(jb6,gbc,GridBagConstraints.RELATIVE,1,2,1);
		
		this.add(jb7,gbc,0,GridBagConstraints.RELATIVE,1,3); //gridy��ֵΪGridBagConstraints.RELATIVEʱ������ӵ����������ǰһ��������·�
		this.add(jb8,gbc,GridBagConstraints.RELATIVE,2,1,1);
		this.add(jb9,gbc,1,GridBagConstraints.RELATIVE,1,1);
		this.add(jb10,gbc,1,GridBagConstraints.RELATIVE,1,1);
		
		//jb11.setBorder(loweredBevelBorder);
		jb11.setBorder(lineBorder);
		this.add(jb11,gbc,2,GridBagConstraints.RELATIVE,GridBagConstraints.REMAINDER,3);
		
		//gbc.insets=new Insets(1,1,1,1);
		
		
		
		
		//jb3.setBorder(loweredBevelBorder);
		
		
		
		//jb4.setBorder(loweredBevelBorder);
		//jb6.setBorder(loweredBevelBorder);
		
		
		
		
		
		
	}

}
