package swingGUI;

import java.awt.*;
import javax.swing.*;
public class Register extends JFrame{

	//定义组件
	JLabel lb1,lb2;
	JCheckBox []cb=new JCheckBox[3];;
	JRadioButton male,fmale;
	JButton jb1,jb2;
	JPanel jp1,jp2,jp3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register register=new Register();
	}

	//构造函数
	public Register(){
		
		//设置布局
		this.setLayout(new GridLayout(3,1));		
		
		//添加组件
		//顶部
		jp1=new JPanel();		
		lb1=new JLabel("你喜欢的运动");
		cb[0]=new JCheckBox("足球");
		cb[1]=new JCheckBox("篮球");
		cb[2]=new JCheckBox("网球");
		jp1.add(lb1);
		jp1.add(cb[0]);
		jp1.add(cb[1]);
		jp1.add(cb[2]);
		this.add(jp1);
		
		//中部
		jp2=new JPanel();
		lb2=new JLabel("你的性别");
		male=new JRadioButton("男");
		fmale=new JRadioButton("女");
		//同一组单选按钮必须加载到一个ButtonGroup对象中
		ButtonGroup gbutton=new ButtonGroup();
		gbutton.add(male);
		gbutton.add(fmale);
		
		jp2.add(lb2);
		jp2.add(male);
		jp2.add(fmale);
		this.add(jp2);
		
		//底部
		jp3=new JPanel();
		jb1=new JButton("注册用户");
		jb2=new JButton("取消注册");
		jp3.add(jb1);
		jp3.add(jb2);
		this.add(jp3);
		
		//设置窗体属性
		this.setTitle("会员注册系统");
		this.setSize(300,200);
		this.setLocation(200,140);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //禁止用户改变窗口大小
				
				
		//显示窗体
		this.setVisible(true);		
		
	}
}
