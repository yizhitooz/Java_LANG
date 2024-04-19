package swingGUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;

/*
 * 用户调查
 * 组合框JComboBox、列表框JList
 */
public class UserSurvey extends JFrame{
	public static void main(String[] arg0){
		UserSurvey us=new UserSurvey();
	}

	public UserSurvey(){
		
		//设置布局
		this.setLayout(new GridLayout(2,1,1,1));
		
		JPanel jp1=new JPanel();
		String addr[]={"北京","上海","成都"};
		//组合框JComboBox
		JComboBox jb=new JComboBox(addr);    
		jp1.add(new JLabel("你的籍贯："));
		jp1.add(jb);
		//jp1.setBackground(Color.CYAN);
		Border bd=BorderFactory.createLoweredBevelBorder();  //创建凹入式边框
		jp1.setBorder(bd);  //jp1边框设置成凹入式
		
		JPanel jp2=new JPanel();
		jp2.setSize(300,150);
		String[] addr1 = {"普洱", "桂林", "峨眉", "大连"};  
		//列表框JList
		JList<String> jl=new JList<String>(addr1);				
		//设置你希望显示多少个选项
		jl.setVisibleRowCount(3);  //滚动条显示setVisibleRowCount(?)?为显示条数
		JScrollPane jsp=new JScrollPane(jl);


		
		jp2.add(new JLabel("你喜欢去旅游的地方："));		
		jp2.add(jsp);
		jp2.setBorder(bd);  //凹入式边框
		
		this.add(jp1);
		this.add(jp2);
		
		//设置窗体属性
		this.setTitle("用户调查");
		this.setSize(300,200);
		this.setLocation(200,140);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //禁止用户改变窗口大小
				
				
		//显示窗体
		this.setVisible(true);
	}
	
}
