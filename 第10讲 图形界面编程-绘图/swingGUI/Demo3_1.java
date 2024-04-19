package swingGUI;
/*
 *  swing——添加组件（二）：获取窗体的内容面板，然后在内容面板上添加基本组件。
 */
import java.awt.*;
import javax.swing.*;

public class Demo3_1 extends JFrame{

	//定义组件
	JLabel jl=null;
	JTextField jtf=null;
	JButton jb=null;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_1 jf=new Demo3_1();
	}

	public Demo3_1(){
		
		//获取窗体的内容面板
		Container con=this.getContentPane();
		
		jl=new JLabel("文本框");
		jtf=new JTextField(10);
		jb=new JButton("按钮");
		
		//添加控件
		//this.add(jl);     不会显示该组件		
		con.add(jl);
		con.add(jtf);
		con.add(jb);
		
		//布局管理
		//con.setLayout(new GridLayout(3,1));
		
		this.setTitle("swing窗体");
		this.setSize(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
