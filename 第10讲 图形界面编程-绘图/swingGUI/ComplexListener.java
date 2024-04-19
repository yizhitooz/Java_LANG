package swingGUI;
/*
 *  �¼�����
 *  һ��������ʵ�ֶ���������ӿڣ�
 *  һ������������ע�ᵽ��������
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;;
public class ComplexListener extends JFrame{
	JTextArea jta_left;
	JTextArea jta_right;
	JButton right;
	JButton left;
	JButton jb_clear;
	JTextArea jta_clear;
	
	public static void main(String[] args){
		
		ComplexListener com=new ComplexListener();
		
	}
	
	public ComplexListener(){
		right=new JButton(">>");
		left=new JButton("<<");
		jb_clear=new JButton("���");
		jta_left=new JTextArea();
		jta_right=new JTextArea();
		jta_clear=new JTextArea("�������ұ߰� C ������ұ����ݡ�");
		
		//���
		jta_left.setBounds(0, 0, 150,209);
		jta_left.setLineWrap(true);//�Զ�����
		jta_left.setBorder(BorderFactory.createEtchedBorder()); //���ñ߿�
		
		//��		
		right.setBounds(150,5,60,30);
		left.setBounds(150,40,60,30);
		jb_clear.setBounds(150,75,60,35);
		jta_clear.setBounds(150,120,60,80);
		jta_clear.setLineWrap(true);//�Զ�����
		
		//��
		jta_right.setBounds(211, 0, 150, 210);
		jta_right.setLineWrap(true);
		jta_right.setBorder(BorderFactory.createLoweredBevelBorder());
		
		JPanel jp=new JPanel();
		jp.setLayout(null);
		jp.add(jta_left);
		jp.add(right);
		jp.add(left);
		jp.add(jb_clear);
		jp.add(jta_clear);
		jp.add(jta_right);
		jp.setBackground(Color.GRAY);
		
		//ע���¼�
		MyListener ml=new MyListener();
		right.addActionListener(ml);
		left.addActionListener(ml);
		jta_right.addKeyListener(ml);
		
		this.add(jp);
		this.setSize(360,250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	//�����������
	class MyListener implements KeyListener,ActionListener{	

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if (arg0.getActionCommand().equals("<<"))
				jta_right.setText(null);
			if (arg0.getActionCommand().endsWith(">>"))
				jta_right.append(jta_left.getText());
		}

		@Override
		//��Դ����ϰ���һ�����󱻵���
		public void keyPressed(KeyEvent e) { 
			// TODO Auto-generated method stub
			
		}

		@Override
		//��Դ������ͷ�һ�����󱻵���
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		//��Դ����ϰ���һ����Ȼ���ͷŸü��󱻵���
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyChar()==KeyEvent.VK_C)
			{
				jta_right.setText(null);
			}
		}
}

}
