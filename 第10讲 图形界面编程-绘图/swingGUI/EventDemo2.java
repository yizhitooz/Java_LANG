package swingGUI;
/*
 * �¼�������WindowEvent�¼�
 * ���¼���������д��GUI����ڲ��࣬�����������з��ʡ�
 */
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class EventDemo2{
	
	public static void main(String [] args){
		
		Frame fr=new Frame("�¼�����ʵ��"); 
		fr.setSize(500,500);            //���ô��ڵĴ�С
		fr.setBackground(Color.green);  //���ô��ڱ�����ɫ

           //ע���¼�����������Frame�������frΪ�¼�Դ
            //addWindowListener(����)  ������һ���¼�����������		
           fr.addWindowListener(new MyWindowListener());

		fr.setVisible(true);            //��ʾ����
	}
	
	
	
	
	//���¼���������д��GUI����ڲ��࣬�����������з��ʡ�
	//�����¼��������ࡣ�¼�����������һ���¼��ӿڵ�ʵ�֣�������һ���¼�������������
	static class MyWindowListener implements WindowListener{
		@Override
		public void windowClosing(WindowEvent e) //�¼�����������
	   {
			System.out.println("�رմ���");
			e.getWindow().setVisible(false);
			e.getWindow().dispose();
			System.exit(0);		
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
}



