package swingGUI;
/*
 * �¼�������ActionEvent�¼�
 */
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JButton;
public class EventButton{
    public static void main(String args[ ])
   {
	JFrame f = new JFrame("Test");
	JButton b = new JButton("Press Me!");
	
	//ע���������
	b.addActionListener(new ButtonHandler( ));
	
	f.add(b, "Center");
	f.pack( );  //�����˴��ڵĴ�С�����ʺ������������ѡ��С�Ͳ���
	f.setVisible(true) ;
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
 }

//�����¼���������
class ButtonHandler implements ActionListener{  //��Ҫimport java.awt.event.*;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Action occurred");
		System.out.println("Button��s label is:"+e.getActionCommand());
	}	
}
