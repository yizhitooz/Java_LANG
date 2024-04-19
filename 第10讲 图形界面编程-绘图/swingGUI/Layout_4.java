package swingGUI;
/*
 * 布局管理器——BoxLayout
 */
import java.awt.*;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout_4 extends JFrame{

	//定义组件
	JButton []jbs=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_4 frameLayout=new Layout_4();
	}
	
	//构造函数
	public Layout_4(){
		
		jbs=new JButton[10];
		//创建组件
		for (int i=0;i<10;i++){
			jbs[i]=new JButton(String.valueOf(i+1));
		}		
				
		//添加各个组件		
		for (int i=0;i<10;i++){
			this.add(jbs[i]);
			this.add(Box.createVerticalStrut(2));  //垂直方向隔开各组件
		}				
				
		//设置布局管理器
		//实例化一个BoxLayout布局管理器对象
		BoxLayout layout=new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS);		//BoxLayout构造方法的第一个参数定义使用该布局的容器，第二个参数指明是水平排列还是垂直排列。
		this.setLayout(layout);  //设置容器的布局		
		
		//设置窗体属性
		this.setTitle("盒式布局案例——BoxLayout");
		this.setSize(350,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		//this.setResizable(false); //禁止用户改变窗口大小		
		
		//显示窗体
		this.setVisible(true);		
	}	

}
/*
 * BoxLayout 往往和 Box 这个容器结合在一起使用，这么做的理由是，BoxLayout 是把控件以水平或者垂直的方向一个接一个的放置，如果要调整这些控件之间的空间，就会需要使用 Box 容器提供的透明的组件作为填充来填充控件之间的空间，从而达到调整控件之间的间隔空间的目的。Box 容器提供了 4 种透明的组件，分别是 rigid area、strut、glue、filler。Box 容器分别提供了不同的方法来创建这些组件。这四个组件的特点如下：
Rigid area 是一种用户可以定义水平和垂直尺寸的透明组件；
strut 与 rigid area 类似，但是用户只能定义一个方向的尺寸，即水平方向或者垂直方向，不能同时定义水平和垂直尺寸；
当用户将 glue 放在两个控件之间时，它会尽可能的占据两个控件之间的多余空间，从而将两个控件挤到两边；
Filler 是 Box 的内部类，它与 rigid area 相似，都可以指定水平或者垂直的尺寸，但是它可以设置最小，最大和优先尺寸。
 * 
 */
