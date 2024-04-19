package swingGUI;
/*
 * ���ֹ�����-GridBagLayout
 * Ӧ��GridBagLayout���ֹ�������������Ҫ��������������
 * ��1��������������GridBagLayout����
 * ��2������GridBagConstraints�ĸ����ԣ�
 * ��3������������һ����������ӵ�������ƣ��ڶ��������Ǹ����ʹ�õĲ��֣���dBagConstraints���趨����
 */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javafx.scene.layout.Border;

public class Layout_5_0 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_5_0 layout=new Layout_5_0();
	}
	
	public Layout_5_0(){
		//�������߿�
		javax.swing.border.Border loweredBevelBorder=BorderFactory.createLoweredBevelBorder();
		
		
		GridBagConstraints gbc=new GridBagConstraints();		
		GridBagLayout gb=new GridBagLayout();
		
		//�������
		//�������
		JButton jb1=new JButton("button one");
		JButton jb2=new JButton("button two");
		JButton jb3=new JButton("button three");
		JButton jb4=new JButton("button four");
		
		   //��1��
		this.setLayout(gb);  //ʹ��GridBagLayout����
		
		   //(2)
		gbc.insets=new Insets(2,2,1,1);
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.fill=GridBagConstraints.NONE;
		gbc.anchor=GridBagConstraints.EAST;
		//gbc.weightx=1;
		
		   //(3)
		this.add(jb1,gbc);
		
		//�ڶ�����ť���������ռ�
		//gbc.gridwidth=GridBagConstraints.REMAINDER;
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.ipadx=1;
		gbc.ipady=1;
		
		//gbc.insets=new Insets(1,1,1,1)		
		this.add(jb2,gbc);
		
		gbc.gridx=5;
		gbc.gridy=0;
		gbc.ipadx=1;
		gbc.ipady=1;		
		
		//jb3.setBorder(loweredBevelBorder);
		this.add(jb3,gbc);
		
		gbc.gridx=8;
		gbc.gridy=1;
		gbc.ipadx=1;
		gbc.ipady=1;			
		this.add(jb4,gbc);
		
				
		//���ô�������
		this.setTitle("�߽粼�ְ�������GridBagLayout");
		this.setSize(400,300);
		
		//��ʾ����
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
