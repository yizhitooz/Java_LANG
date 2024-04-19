package ������.TCP.demo3;

/**   
 * ȫ˫���ͻ�������������м��׽�������
 * 
 * ȫ˫���������ˣ�������9999�˿ڼ���
 * ���Խ��տͻ��˷���������
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
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

public class MyServer3 extends JFrame implements ActionListener{
	JTextArea jta;
	JTextField jtf;
	JButton jb;
	JPanel jp1;
	JScrollPane jsp;
	
	InputStreamReader isr;
	BufferedReader br;
	PrintWriter pw;
	
	public static void main(String[] args) {
		new MyServer3();
	}
	
	//���캯��
	public MyServer3(){
		jta=new JTextArea();
		jtf=new JTextField(20);
		jb=new JButton("����");
		jb.addActionListener(this);
		//��jb���Ͱ�ť��ӿ�ݼ�(�س�)�¼�
		jb.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "fasong");
		jb.getActionMap().put("fasong", new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				String info=jtf.getText();
				jta.append("�ͻ��� �� �����˵��"+info+"\r\n");
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
		this.setTitle("qq��������--�����");
		this.setSize(350, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		try {
			//��9999�Ŷ˿��ϼ���
			ServerSocket ss=new ServerSocket(9999);
			//�ȴ��ͻ�������
			Socket s=ss.accept();
			//��ȡ�ӿͻ��˷�������Ϣ
			isr=new InputStreamReader(s.getInputStream());
			br=new BufferedReader(isr);
			pw=new PrintWriter(s.getOutputStream(),true);
			while(true){
				//��ȡ�ӿͻ��˷�������Ϣ
				String info=br.readLine();
				jta.append("�ͻ��� �� �����˵��"+info+"\r\n");
			}
		} catch (IOException e) {
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
		//����û����·�����Ϣ�İ�ť
		if(e.getSource()==jb){
			//�ѷ�������jtfд�� ���ݷ��͸��ͻ���
			String info=jtf.getText();
			//��jta�в���׷������
			jta.append("����� �� �ͻ���˵��"+info+"\r\n");
			pw.println(info);
			//���jtf����
			jtf.setText("");
		}
	}
}
