package swingGUI;
/*
 * 布局管理器-GridBagLayout
 * 应用GridBagLayout布局管理器。布局灵活。要采用下面三步：
 * （1）设置容器采用GridBagLayout布局
 * （2）设置GridBagConstraints的各属性，
 * （3）添加组件：第一个参数是添加的组件名称，第二个参数是该组件使用的布局（由dBagConstraints类设定）。
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
		//设置面板边框
		javax.swing.border.Border loweredBevelBorder=BorderFactory.createLoweredBevelBorder();
		
		
		GridBagConstraints gbc=new GridBagConstraints();		
		GridBagLayout gb=new GridBagLayout();
		
		//创建组件
		//创建组件
		JButton jb1=new JButton("button one");
		JButton jb2=new JButton("button two");
		JButton jb3=new JButton("button three");
		JButton jb4=new JButton("button four");
		
		   //（1）
		this.setLayout(gb);  //使用GridBagLayout布局
		
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
		
		//第二个按钮填满整个空间
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
		
				
		//设置窗体属性
		this.setTitle("边界布局案例——GridBagLayout");
		this.setSize(400,300);
		
		//显示窗体
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
