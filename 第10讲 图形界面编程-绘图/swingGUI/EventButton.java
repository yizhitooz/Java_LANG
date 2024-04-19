package swingGUI;
/*
 * 事件处理——ActionEvent事件
 */
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JButton;
public class EventButton{
    public static void main(String args[ ])
   {
	JFrame f = new JFrame("Test");
	JButton b = new JButton("Press Me!");
	
	//注册监听器。
	b.addActionListener(new ButtonHandler( ));
	
	f.add(b, "Center");
	f.pack( );  //调整此窗口的大小，以适合其子组件的首选大小和布局
	f.setVisible(true) ;
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
 }

//定义事件监视器类
class ButtonHandler implements ActionListener{  //需要import java.awt.event.*;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Action occurred");
		System.out.println("Button’s label is:"+e.getActionCommand());
	}	
}
