package swingGUI;
/**
 * 1���˵����
    	JMenuBar	�˵������	����
    	JMenu		�˵����	��֦
    	JMenuItem	�˵������	��Ҷ
	2�������˵�����
    	JMenu�������Ƕ��JMenu
	3�����������
    	JToolBar	���������
 */
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class Menu extends JFrame{
	//�ļ��鶨�����
	JMenuBar jmb;//�˵������
	JMenu menu1,menu2,menu3,menu4,menu5;//���˵����ļ����༭����ʽ���鿴������
	JMenuItem item2,item3,item4,item5,item6,item7;//�Ӳ˵����½����򿪡����桢���Ϊ��ҳ�����á���ӡ���˳�
	JMenu xinjian;//�����˵�
	JMenuItem file,project;
	
	//�༭�鶨�����
	//�༭�����������С����ơ�ճ����ɾ�������ҡ�������һ�����滻��ת����ȫѡ��ʱ��/����
	JMenuItem eitem1,eitem2,eitem3,eitem4,eitem5,eitem6,eitem7,eitem8,eitem9,eitem10,eitem11;
	
	//��ʽ�鶨�����
	JMenuItem oitem1,oitem2;//��ʽ���Զ����С�����
	
	//�鿴�鶨�����
	JMenuItem vitem1;//�鿴��״̬��
	
	//�����鶨�����
	JMenuItem hitem1,hitem2;//�������鿴���������ڼ��±�
	
	JTextArea jta;
	//������
	JToolBar jtb;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8;
	
	public static void main(String[] args) {
		Menu win=new Menu();
	}
	//���캯��
	public Menu(){
		//�������
		//������
		jtb=new JToolBar();
		jb1=new JButton(new ImageIcon("images/new.jpg"));
		jb1.setToolTipText("�½�");//������ʾ��Ϣ
		jb2=new JButton(new ImageIcon("images/open.jpg"));
		jb2.setToolTipText("��");
		jb3=new JButton(new ImageIcon("images/save.jpg"));
		jb3.setToolTipText("����");
		jb4=new JButton(new ImageIcon("images/copy.jpg"));
		jb4.setToolTipText("����");
		jb5=new JButton(new ImageIcon("images/delete.jpg"));
		jb5.setToolTipText("ɾ��");
		jb6=new JButton(new ImageIcon("images/modify.jpg"));
		jb6.setToolTipText("�༭");
		jb7=new JButton(new ImageIcon("images/print.jpg"));
		jb7.setToolTipText("��ӡ");
		jb8=new JButton(new ImageIcon("images/close.jpg"));
		jb8.setToolTipText("�ر�");
		
		jmb=new JMenuBar();
		//���˵�
		menu1=new JMenu("�ļ�(F)");
		menu1.setMnemonic('F');//�������Ƿ�
		menu2=new JMenu("�༭(E)");
		menu2.setMnemonic('E');
		menu3=new JMenu("��ʽ(O)");
		menu3.setMnemonic('O');
		menu4=new JMenu("�鿴(V)");
		menu4.setMnemonic('V');
		menu5=new JMenu("����(H)");
		menu5.setMnemonic('H');
		
		//�ļ�--�½�--��Ŀ¼
		xinjian=new JMenu("�½�");
		file=new JMenuItem("�ļ�");
		project=new JMenuItem("����");
		
		item2=new JMenuItem("��(O)");
		item2.setMnemonic('O');
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));//����ctrl�����ϼ�
		item3=new JMenuItem("����(S)");
		item3.setMnemonic('S');
		item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		item4=new JMenuItem("���Ϊ(A)");
		item4.setMnemonic('A');
		item5=new JMenuItem("ҳ������(U)");
		item5.setMnemonic('U');
		item6=new JMenuItem("��ӡ(P)");
		item6.setMnemonic('P');
		item6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.CTRL_MASK));
		item7=new JMenuItem("�˳�(X)");
		item7.setMnemonic('X');
		
		eitem1=new JMenuItem("����(U)");
		eitem1.setMnemonic('U');
		eitem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,InputEvent.CTRL_MASK));
		eitem2=new JMenuItem("����(T)");
		eitem2.setMnemonic('T');
		eitem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,InputEvent.CTRL_MASK));
		eitem3=new JMenuItem("����(C)");
		eitem3.setMnemonic('C');
		eitem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
		eitem4=new JMenuItem("ճ��(P)");
		eitem4.setMnemonic('P');
		eitem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.CTRL_MASK));
		eitem5=new JMenuItem("ɾ��(L)");
		eitem5.setMnemonic('L');
		eitem5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
		eitem6=new JMenuItem("����(F)");
		eitem6.setMnemonic('F');
		eitem6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,InputEvent.CTRL_MASK));
		eitem7=new JMenuItem("������һ��(N)");
		eitem7.setMnemonic('N');
		eitem7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));
		eitem8=new JMenuItem("�滻(R)");
		eitem8.setMnemonic('R');
		eitem8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_MASK));
		eitem9=new JMenuItem("ת��(G)");
		eitem9.setMnemonic('G');
		eitem9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,InputEvent.CTRL_MASK));
		eitem10=new JMenuItem("ȫѡ(A)");
		eitem10.setMnemonic('A');
		eitem10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));
		eitem11=new JMenuItem("ʱ��/����(D)");
		eitem11.setMnemonic('D');
		eitem11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));
		
		oitem1=new JMenuItem("�Զ�����(W)");
		oitem1.setMnemonic('W');
		oitem2=new JMenuItem("����(F)");
		oitem2.setMnemonic('F');
		
		vitem1=new JMenuItem("״̬��(S)");
		vitem1.setMnemonic('S');
		
		hitem1=new JMenuItem("�鿴����(H)");
		hitem1.setMnemonic('H');
		hitem2=new JMenuItem("���ڼ��±�(A)");
		hitem2.setMnemonic('A');
		
		jta=new JTextArea();
		
		//�趨���ֹ�����
		
		//�������
		//����ť��ӵ���������
		jtb.add(jb1);
		jtb.add(jb2);
		jtb.add(jb3);
		jtb.add(jb4);
		jtb.add(jb5);
		jtb.add(jb6);
		jtb.add(jb7);
		jtb.add(jb8);
		
		//���˵�����ӵ��˵���
		xinjian.add(file);
		xinjian.add(project);
		
		menu1.add(xinjian);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		menu1.addSeparator();//��ӷָ���
		menu1.add(item5);
		menu1.add(item6);
		menu1.addSeparator();
		menu1.add(item7);
		
		menu2.add(eitem1);
		menu2.addSeparator();
		menu2.add(eitem2);
		menu2.add(eitem3);
		menu2.add(eitem4);
		menu2.add(eitem5);
		menu2.addSeparator();
		menu2.add(eitem6);
		menu2.add(eitem7);
		menu2.add(eitem8);
		menu2.add(eitem9);
		menu2.addSeparator();
		menu2.add(eitem10);
		menu2.add(eitem11);
		
		menu3.add(oitem1);
		menu3.add(oitem2);
		
		menu4.add(vitem1);
		
		menu5.add(hitem1);
		menu5.addSeparator();
		menu5.add(hitem2);
		
		//���˵���ӵ��˵�����
		jmb.add(menu1);
		jmb.add(menu2);
		jmb.add(menu3);
		jmb.add(menu4);
		jmb.add(menu5);
		
		//���˵�����ӵ�������
		this.setJMenuBar(jmb);
		
		//����������ӵ�������
		this.add(jtb,BorderLayout.NORTH);
		
		JScrollPane jsp=new JScrollPane(jta);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(jsp);
		
		//��������
		this.setTitle("Java���±�");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}
