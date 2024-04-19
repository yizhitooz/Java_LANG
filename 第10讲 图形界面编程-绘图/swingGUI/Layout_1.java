package swingGUI;
/*
 *     布局——BorderLayout演示
 *     1. 继承JFrame
 *     2. 定义你需要的组件
 *     3. 创建组件（一般构造函数中）
 *     4. 添加组件
 *     5. 设置窗体属性
 *     6. 显示窗体
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

import com.sun.java.swing.plaf.windows.resources.windows;
//import javax.swing.event.*;

public class Layout_1 extends JFrame{
	//定义组件
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_1 frameLayout=new Layout_1();
	}
	
	//构造函数
	public Layout_1(){
		
		//获取swing窗体风格，并一一打印出来
		UIManager.LookAndFeelInfo []info=UIManager.getInstalledLookAndFeels();		
		for(UIManager.LookAndFeelInfo tem:info)
		{
		   System.out.println(tem.getClassName());
		}
		
		//设置swing窗体风格
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
		
		//创建组件
		jb1=new JButton("中部");
		jb2=new JButton("北部");
		jb3=new JButton("东部");
		jb4=new JButton("南部");
		jb5=new JButton("西部");
		
		jb6=new JButton("中部2");
		
		//添加各个组件		
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2, BorderLayout.NORTH);
		this.add(jb3, BorderLayout.EAST);
		this.add(jb4,BorderLayout.SOUTH);
		this.add(jb5,BorderLayout.WEST);
		
		this.add(jb6, BorderLayout.CENTER);
		
		//设置窗体属性
		this.setTitle("边界布局案例——BorderLayout");
		this.setSize(400,300);
		
		//显示窗体
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
