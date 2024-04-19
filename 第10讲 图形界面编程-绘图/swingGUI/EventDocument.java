package swingGUI;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EventDocument extends JFrame{

	//定义组件
	JTextArea jta1;
	JTextArea jta2;
	JPanel jp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDocument evDo=new EventDocument();
	}
	
	public EventDocument(){
		
		//创建组件
		jta1=new JTextArea(40,50);
		jta1.setText("请输入");
		jta2=new JTextArea(40,50);
		jta2.setText("输出");
		jp=new JPanel();
		
		//设置边框
		Border border=BorderFactory.createBevelBorder(1);
		jta1.setBorder(border);
		jta2.setBorder(border);			
		
		//设置布局
		jp.setLayout(null);
		jta1.setBounds(5, 5, 150, 200);
		jta2.setBounds(200, 5,150, 200);
		
		//添加组件
		jp.add(jta1);			
		jp.add(jta2);
		this.add(jp);
		
		//注册事件
		//jta1.add
		
		this.setTitle("DocumentEvent 事件实例");
		this.setSize(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyEventDocument implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			String text=jta1.getText();
			jta2.setText(text);
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
