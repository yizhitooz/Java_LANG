package swingGUI;
/*
 *     布局——GridLayout演示
 *     1. 继承JFrame
 *     2. 定义你需要的组件
 *     3. 创建组件（一般构造函数中）
 *     4. 添加组件
 *     5. 设置窗体属性
 *     6. 显示窗体
 */
import java.awt.*;
import javax.swing.*;

public class Layout_3 extends JFrame{
	//定义组件
	JButton []jbs=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_3 frameLayout=new Layout_3();
	}
	
	//构造函数
	public Layout_3(){
		
		jbs=new JButton[9];
		//创建组件
		for (int i=0;i<9;i++){
			jbs[i]=new JButton(String.valueOf(i+1));
		}	
		
		//添加各个组件		
		for (int i=0;i<9;i++){
			this.add(jbs[i]);
		}
		
		//设置布局管理器
		this.setLayout(new GridLayout(3,3,4,4));  //设置3行3列网格
		
		//设置窗体属性
		this.setTitle("网格布局案例——GridLayout");
		this.setSize(500,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //禁止用户改变窗口大小
		
		
		//显示窗体
		this.setVisible(true);		
	}		
}
