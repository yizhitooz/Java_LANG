package swingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Exercise extends JFrame{
	JPanel jp=null;
	JTextArea jta=null;
	JButton jb=null;
	String filename;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise ex=new Exercise();

	}
	public Exercise(){
		jta=new JTextArea(20,60);
		jb=new JButton("Save");
		jp=new JPanel();
		jta.setBounds(0,0,300,350);
		jb.setBounds(150,360,100,100);
		jp.add(jta);
		jp.add(jb);
		
		this.add(jp);
		
		
		jb.addActionListener(new TextActionListener());
		
		this.setSize(700, 450);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void writeFile(String filename,String str) throws IOException{
		File f=new File(filename); 
		 
		 //创建一个输出流对象
		 OutputStream out =new FileOutputStream(f);  //如果D盘不存在文件"hello.txt",则会新建此文件
		 //String str="Hello World";
		 byte[] b=str.getBytes();  //将字符串转换为byte数组存放
		 
		//写文件
		 out.write(b);  
		 
		//关闭流对象
		 out.close();
	}
	class TextActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String str=jta.getText();
			try {
				writeFile("D:/mytext.txt",str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
