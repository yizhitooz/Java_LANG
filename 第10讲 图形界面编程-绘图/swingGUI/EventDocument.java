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

	//�������
	JTextArea jta1;
	JTextArea jta2;
	JPanel jp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDocument evDo=new EventDocument();
	}
	
	public EventDocument(){
		
		//�������
		jta1=new JTextArea(40,50);
		jta1.setText("������");
		jta2=new JTextArea(40,50);
		jta2.setText("���");
		jp=new JPanel();
		
		//���ñ߿�
		Border border=BorderFactory.createBevelBorder(1);
		jta1.setBorder(border);
		jta2.setBorder(border);			
		
		//���ò���
		jp.setLayout(null);
		jta1.setBounds(5, 5, 150, 200);
		jta2.setBounds(200, 5,150, 200);
		
		//������
		jp.add(jta1);			
		jp.add(jta2);
		this.add(jp);
		
		//ע���¼�
		//jta1.add
		
		this.setTitle("DocumentEvent �¼�ʵ��");
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
