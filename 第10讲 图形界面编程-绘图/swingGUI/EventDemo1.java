package swingGUI;
/*
 * �¼�������WindowEvent�¼�
 */
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
public class EventDemo1
{
	public static void main(String [] args)
	{
		
		JFrame fr=new JFrame("�¼�����ʵ��"); 
		fr.setSize(500,500);            //���ô��ڵĴ�С
		fr.setBackground(Color.green);  //���ô��ڱ�����ɫ

           //ע���¼�����������Frame�������frΪ�¼�Դ
            //addWindowListener(����)  ������һ���¼�����������
           fr.addWindowListener(new MyWindowListener());

		fr.setVisible(true);            //��ʾ����
	}
}

//�����¼��������ࡣ�¼�����������һ���¼��ӿڵ�ʵ�֣�������һ���¼�������������
//�¼���������������Ǽ����Ƿ���ĳ�֣�ĳЩ���¼�����������Ӧ���¼�����
class MyWindowListener implements WindowListener {  //��Ҫimport java.awt.event.*
	@Override
	public void windowClosing(WindowEvent e) //�¼�����������
   {
		System.out.println("�رմ���");
		e.getWindow().setVisible(false);
		e.getWindow().dispose();  //�ͷ����б�����Դ
		System.exit(0);		//�رմ���ʱ��Ҳ��ֹ��������
	}
    
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
