package swing.layout;
/*
*    图形用户界面 - 窗体
*    import javax.swing.*;
*/
import java.awt.*;
import javax.swing.*; //后面要使用JFrame类

/*
 * 通常的做法是，使要创建窗体的类成为JFrame的派生类，这个派生类就可以创建窗体
 */
public class Demo1_2 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_2 window=new Demo1_2();
	}
	
	public Demo1_2(){
		this.setTitle("swing窗体");
		this.setSize(800, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
