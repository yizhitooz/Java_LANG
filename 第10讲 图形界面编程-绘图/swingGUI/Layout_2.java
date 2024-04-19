package swingGUI;
/*
 *     布局——FlowLayout演示
 *     1. 继承JFrame
 *     2. 定义你需要的组件
 *     3. 创建组件（一般构造函数中）
 *     4. 添加组件
 *     5. 设置窗体属性
 *     6. 显示窗体
 */
import java.awt.*;
import javax.swing.*;

public class Layout_2 extends JFrame{
	//定义组件
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_2 frameLayout=new Layout_2();
	}
	
	//构造函数
	public Layout_2(){
		
		//创建组件
		jb1=new JButton("按钮1");		
		jb2=new JButton("按钮2");
		jb3=new JButton("按钮3");
		jb4=new JButton("按钮4");
		jb5=new JButton("按钮5");
		jb6=new JButton("按钮6");
		
		//添加各个组件		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//设置布局管理器
		this.setLayout(new FlowLayout(FlowLayout.LEFT));  //左对齐
		
		//设置窗体属性
		this.setTitle("流式布局案例——FlowLayout");
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //禁止用户改变窗口大小
		
		
		//显示窗体
		this.setVisible(true);
		
		
	}

}
