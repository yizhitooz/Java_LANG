package swingGUI;
/*
 * ���� �������������� (***Adapter)��ʵ��java���¼�����
 * ��� �رմ��ڣ�����̨������رա�
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//�����������
class MyWindowAdpager extends WindowAdapter{
   //������	
   public void windowClosing(WindowEvent e){//���������ڹرչ�����ʱ����   
       System.out.println("�ر�");
       System.exit(0);
    }
}

public class EventWindowAdapter extends JFrame
{
   public EventWindowAdapter()
   {
       //ע���¼�Դ
       addWindowListener(new MyWindowAdpager());
    }
    public static void main(String[] agrs){
        JFrame frame = new EventWindowAdapter();
        frame.setSize(400,400);
        frame.setLocation(400,300);
        frame.setVisible(true);
    }
}