package swingGUI;
/*
 * KeyEvent
 * ActionEvent
 */
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EventKey extends JFrame{

	//�������
	JTextArea jta1;
	JTextArea jta2;
	JPanel jp;
	JButton jbr;
	JButton jbl;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventKey evDo=new EventKey();
	}
	
	public EventKey(){
		
		//�������
		jta1=new JTextArea(40,50);
		jta1.setText("������");
		jta2=new JTextArea(40,50);
		jta2.setText("���");
		jp=new JPanel();
		jbl=new JButton("<<");
		jbr=new JButton(">>");
		
		//���ñ߿�
		Border border=BorderFactory.createBevelBorder(1);
		jta1.setBorder(border);
		jta2.setBorder(border);			
		
		//���ò���
		jp.setLayout(null);
		jta1.setBounds(5, 5, 150, 200);
		jta2.setBounds(220, 5,150, 200);
		jbl.setBounds(160,100,50,30);
		jbr.setBounds(160,140,50,30);
		
		//������
		jp.add(jta1);			
		jp.add(jta2);
		jp.add(jbl);
		jp.add(jbr);
		this.add(jp);
		
		//ע���¼�
		jta2.addKeyListener(new MyEvent());
		jbl.addActionListener(new MyEvent());
		jbr.addActionListener(new MyEvent());
		
		this.setTitle("DocumentEvent �¼�ʵ��");
		this.setSize(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyEvent implements KeyListener,ActionListener{

		@Override
		public void keyPressed(KeyEvent e) {
			String str="hello";
			// TODO Auto-generated method stub
			if (e.getKeyChar()=='k')
			{
				jta2.setText(str);
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		//--------------------
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getActionCommand()=="<<")
			{
				jta1.setText(jta2.getText());
			}
			if (e.getActionCommand()==">>")
			{
				System.out.println(">>");
				jta2.setText(jta1.getText());
			}
		}
		
	}
}
