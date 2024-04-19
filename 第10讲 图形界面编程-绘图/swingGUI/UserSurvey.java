package swingGUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;

/*
 * �û�����
 * ��Ͽ�JComboBox���б��JList
 */
public class UserSurvey extends JFrame{
	public static void main(String[] arg0){
		UserSurvey us=new UserSurvey();
	}

	public UserSurvey(){
		
		//���ò���
		this.setLayout(new GridLayout(2,1,1,1));
		
		JPanel jp1=new JPanel();
		String addr[]={"����","�Ϻ�","�ɶ�"};
		//��Ͽ�JComboBox
		JComboBox jb=new JComboBox(addr);    
		jp1.add(new JLabel("��ļ��᣺"));
		jp1.add(jb);
		//jp1.setBackground(Color.CYAN);
		Border bd=BorderFactory.createLoweredBevelBorder();  //��������ʽ�߿�
		jp1.setBorder(bd);  //jp1�߿����óɰ���ʽ
		
		JPanel jp2=new JPanel();
		jp2.setSize(300,150);
		String[] addr1 = {"�ն�", "����", "��ü", "����"};  
		//�б��JList
		JList<String> jl=new JList<String>(addr1);				
		//������ϣ����ʾ���ٸ�ѡ��
		jl.setVisibleRowCount(3);  //��������ʾsetVisibleRowCount(?)?Ϊ��ʾ����
		JScrollPane jsp=new JScrollPane(jl);


		
		jp2.add(new JLabel("��ϲ��ȥ���εĵط���"));		
		jp2.add(jsp);
		jp2.setBorder(bd);  //����ʽ�߿�
		
		this.add(jp1);
		this.add(jp2);
		
		//���ô�������
		this.setTitle("�û�����");
		this.setSize(300,200);
		this.setLocation(200,140);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //��ֹ�û��ı䴰�ڴ�С
				
				
		//��ʾ����
		this.setVisible(true);
	}
	
}
