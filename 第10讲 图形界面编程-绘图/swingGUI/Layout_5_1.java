package swingGUI;
import java.awt.Color;
import java.awt.Font;
/*
 * 布局管理器-GridBagLayout
 * 在“Layout_5_0.java"中，需要多次重复设置GridBagConstraints的各属性，
 * 为了减少代码重写，可以定义一个方法来对GridBagLayout布局中，GridBagConstraints的各属性的设置:
 * 比如下面的方法   add(JComponent c,GridBagConstraints gbc,int x,int y,int width,int height) 
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
		//设置窗体属性
		jf.setTitle("边界布局案例——GridBagLayout");
		jf.setSize(600,400);
		
		//显示窗体
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
		//设置面板边框
		javax.swing.border.Border loweredBevelBorder=BorderFactory.createLoweredBevelBorder();
		javax.swing.border.Border lineBorder=BorderFactory.createLineBorder(Color.RED);
						
		GridBagConstraints gbc=new GridBagConstraints();		
		GridBagLayout gb=new GridBagLayout();
		
		//创建组件
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
		
				//(1)设置容器采用GridBagLayout布局
		this.setLayout(gb);  		
		
				//(2)设置GridBagConstraints的各属性，
		
		gbc.fill=GridBagConstraints.BOTH;
		//gbc.weightx=1;  //横向按比例缩放布满整个容器；否则，组件的大小不会随着窗口的大小变化而变化。
		//gbc.weighty=1;  //纵向按比例缩放布满整个容器；否则，组件的大小不会随着窗口的大小变化而变化。
		gbc.anchor=GridBagConstraints.SOUTH;		//anchor: 组件在单元格中的对齐方式
				
		        //(3)添加组件：第一个参数是添加的组件名称，第二个参数是该组件使用的布局（由dBagConstraints类设定）。
		this.add(jb1,gbc,0,0,1,1);
		this.add(jb2,gbc,1,0,1,1);
		this.add(jb3,gbc,GridBagConstraints.RELATIVE,0,1,1);  //gridx的值为GridBagConstraints.RELATIVE时，所添加的组件放置在前一个组件的右侧
		//jb4横向占用整个行剩余单元格
		this.add(jb4,gbc,3,0,GridBagConstraints.REMAINDER,1);
		
		this.add(jb5,gbc,0,1,2,1);
		this.add(jb6,gbc,GridBagConstraints.RELATIVE,1,2,1);
		
		this.add(jb7,gbc,0,GridBagConstraints.RELATIVE,1,3); //gridy的值为GridBagConstraints.RELATIVE时，所添加的组件放置在前一个组件的下方
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
