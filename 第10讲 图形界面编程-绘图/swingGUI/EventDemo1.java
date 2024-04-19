package swingGUI;
/*
 * 事件处理——WindowEvent事件
 */
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
public class EventDemo1
{
	public static void main(String [] args)
	{
		
		JFrame fr=new JFrame("事件处理实例"); 
		fr.setSize(500,500);            //设置窗口的大小
		fr.setBackground(Color.green);  //设置窗口背景颜色

           //注册事件监听器对象，Frame组件对象fr为事件源
            //addWindowListener(参数)  参数是一个事件监听器对象
           fr.addWindowListener(new MyWindowListener());

		fr.setVisible(true);            //显示窗口
	}
}

//定义事件监听器类。事件监听器类是一个事件接口的实现，或者是一个事件适配器的子类
//事件监听器类的作用是监听是否发生某种（某些）事件，并进行相应的事件处理
class MyWindowListener implements WindowListener {  //需要import java.awt.event.*
	@Override
	public void windowClosing(WindowEvent e) //事件处理器方法
   {
		System.out.println("关闭窗口");
		e.getWindow().setVisible(false);
		e.getWindow().dispose();  //释放所有本地资源
		System.exit(0);		//关闭窗体时，也终止程序运行
	}
    
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
