package swingGUI;
/*
*    图形用户界面 - 窗体
*    设置背景颜色
*/
import java.awt.*;
import javax.swing.*; //后面要使用JFrame类

public class Demo2 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 window=new Demo2();
	}
	
	public Demo2(){
		this.setTitle("swing窗体");
		this.setSize(400, 300);
		
		//设置背景颜色
		//方法一
		//this.getContentPane().setBackground(Color.black);
		
		//方法二
		//this.getContentPane().setVisible(false);		
		//this.setBackground(Color.black);
		
		//方法三
		//JPanel jp=new JPanel();
		//jp.setBackground(Color.black);
		//this.add(jp);
		
		//方法四
		Container con=this.getContentPane();
		con.setBackground(Color.black);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
