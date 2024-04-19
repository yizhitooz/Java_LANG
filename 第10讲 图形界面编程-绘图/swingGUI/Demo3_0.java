package swingGUI;

import java.awt.FlowLayout;
import java.awt.GridLayout;

/*
 * 添加组件（一）：直接将基本组件添加到JFrame容器中。
 */

import javax.swing.*;
/*
 *  添加组件、容器布局
*/
public class Demo3_0 extends JFrame{
	
	//（1）定义组件
	JLabel jl=null;
	JTextField jtf=null;
	JButton jb=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_0 jf=new Demo3_0();
		
	}

	public Demo3_0(){
		
		//（2）创建组件
		jl=new JLabel("文本框");
		jtf=new JTextField(10);
		jtf.setText("请输入");
		jb=new JButton("确定");			
		
		//（3）添加组件
		this.add(jl);
		this.add(jtf);		
		//问题：后添加的组件覆盖了先添加的组件。
		
		//解决办法：进行布局管理
		//this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//设置窗体
		this.setTitle("swing窗体-添加组件");  //设置标题栏		
		this.setSize(300, 200);  //设置窗体大小，(宽，高)按像素		
		this.setLocation(100, 100);  //设置窗体初始位置，如不设置初始位置，窗体的原点为屏幕左上角		
		//jf.setIconImage(new ImageIcon("images/baby.jpg").getImage());   //设置标题栏图标
		this.setVisible(true); //显示窗体
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //关闭窗体的时候，保证jvm也退出。

	}
}
