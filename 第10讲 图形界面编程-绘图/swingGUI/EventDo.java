package swingGUI;
/*
 * �¼��������
 * ActionEvent �¼�
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
		jb1=new JButton("��ɫ");
		jb2=new JButton("��ɫ");
		
		this.add(jb1,BorderLayout.NORTH);
		mp.setBackground(Color.green);
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		
		//ע������¼�
		jb1.addActionListener(this); //����Ϊ�¼������ߣ������this˵����������EventDo�����
		jb2.addActionListener(this);

		this.setSize(200, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//��д�¼�������
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("��ɫ")){
			System.out.println("����˺�ɫ��ť");
			mp.setBackground(Color.BLACK);
		}else if(e.getActionCommand().equals("��ɫ")){
			System.out.println("����˺�ɫ��ť");
			mp.setBackground(Color.RED);
		}else{
			System.out.println("��֪��");
		}
	}
}

