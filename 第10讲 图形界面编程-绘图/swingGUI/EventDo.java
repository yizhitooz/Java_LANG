package swingGUI;
/*
 * 事件处理机制
 * ActionEvent 事件
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class EventDo extends JFrame implements ActionListener{
	JPanel mp=null;
	JButton jb1=null;
	JButton jb2=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDo evDo=new EventDo();
	}
	public EventDo(){		
		Container con=this.getContentPane();
		mp=new JPanel();
		jb1=new JButton("黑色");
		jb2=new JButton("红色");
		
		this.add(jb1,BorderLayout.NORTH);
		mp.setBackground(Color.green);
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		
		//注册监听事件
		jb1.addActionListener(this); //参数为事件监听者，这里的this说明监听者是EventDo类对象
		jb2.addActionListener(this);

		this.setSize(200, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//重写事件处理方法
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("黑色")){
			System.out.println("点击了黑色按钮");
			mp.setBackground(Color.BLACK);
		}else if(e.getActionCommand().equals("红色")){
			System.out.println("点击了红色按钮");
			mp.setBackground(Color.RED);
		}else{
			System.out.println("不知道");
		}
	}
}

