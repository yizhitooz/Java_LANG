package swingGUI;

/*
 *    拆分窗体——JSplitPane
 */
import java.awt.*;
import javax.swing.*;

public class Dict extends JFrame{

	//定义组件
	JSplitPane jsp,jspr;
	JList jList1=null,jList2=null;
	JLabel jll;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dict dict=new Dict();
	}

	public Dict(){
		//创建组件
		String []words={"boy","girl","bird","annoymous"};
		jList1=new JList<String>(words);
		jList2=new JList<String>(words);
		
		jll=new JLabel(new ImageIcon("src/images/veryhuo.com_28.gif"));		//此处，images和当前java文件的父目录的父目录同一级。文件路径用左斜杠/；如何用\,需要写两个\\
		
		//拆分窗格
		jspr=new JSplitPane(JSplitPane.VERTICAL_SPLIT,jList2,jll);  //右边拆分为上下两部分
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jList1,jspr);  //整个窗口拆分为左右两部分
		//可以隐藏左右窗格
		jsp.setOneTouchExpandable(true);
		
		//添加组件（方法一）
		Container con=this.getContentPane();
		con.add(jsp);
		
		//添加组件（方法二）
		//this.add(jsp);
		
		//设置窗体属性
		this.setTitle("有道词典");
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //禁止用户改变窗口大小
				
				
		//显示窗体
		this.setVisible(true);	
	}
}
