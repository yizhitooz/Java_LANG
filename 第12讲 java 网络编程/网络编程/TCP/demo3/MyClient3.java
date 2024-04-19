package 网络编程.TCP.demo3;
/**
 * 全双工客户端与服务器进行简易界面聊天
 * 
 * 这是一个客户端程序，可以连接服务器端口9999
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class MyClient3 extends JFrame implements ActionListener{
	JTextArea jta;
	JTextField jtf;
	JButton jb;
	JPanel jp1;
	JScrollPane jsp;
	
	InputStreamReader isr;
	BufferedReader br;
	PrintWriter pw;
	
	public static void main(String[] args) {
		new MyClient3();
	}
	
	public MyClient3(){
		jta=new JTextArea();
		jtf=new JTextField(20);
		jtf.setFocusable(true);
		jb=new JButton("发送");
		jb.addActionListener(this);
		//给jb发送按钮添加快捷键(回车)事件
	jb.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "fasong");
		jb.getActionMap().put("fasong", new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				String info=jtf.getText();
				jta.append("客户端 对 服务端说："+info+"\r\n");
				pw.println(info);
				jtf.setText("");
			}
		});
		
		jp1=new JPanel();
		jp1.add(jtf);
		jp1.add(jb);
		jsp=new JScrollPane(jta);
		this.add(jsp,"Center");
		this.add(jp1,"South");
		
		this.setTitle("qq简易聊天--客户端");
		this.setSize(350, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		try {
			//Socket()就是去连接某个服务器端 127.0.0.1表示服务器的ip
			Socket s=new Socket("127.0.0.1",9999);

			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			pw=new PrintWriter(s.getOutputStream(),true);
			while(true){
				//读取服务器端发来的信息
				String info=br.readLine();
				jta.append("服务端 对 客户端说："+info+"\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(pw!=null) pw.close();
				if(br!=null) br.close();
				if(isr!=null) isr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb){
			String info=jtf.getText();
			jta.append("客户端 对 服务端说："+info+"\r\n");
			pw.println(info);
			jtf.setText("");
		}
	}
}

