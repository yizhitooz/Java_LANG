package swingGUI;
/*
 *  swing�����������������������������ӵ�JPanel����ϣ��ٽ�JPanel�����ӵ�JFrame������
 *  JPanelĬ�ϲ�����ʽ����
 */
import java.awt.*;
import javax.swing.*;

public class Demo3_3 extends JFrame{

	//����������
	JLabel jl1=null;
	JLabel jl2=null;
	JLabel jl3=null;
	JTextField jtf=null;
	JButton jb=null;	
	
	//����������
	JPanel jp1=null;
	JPanel jp2=null;
	JPanel jp3=null;
	JPanel jp4=null;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_3 js=new Demo3_3();
	}

	public Demo3_3(){
		
		//����������
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
		//�����������		
		JLabel jl1=new JLabel("�ı���");
		JLabel jl2=new JLabel("��ť:");
		JLabel jl3=new JLabel("ѡ���:");
		JLabel jl4=new JLabel("��ѡ��ť:");
		JLabel jl5=new JLabel("�����б�:");
		JLabel jl6=new JLabel("�ı���:");
		JTextField jtf=new JTextField("������,������20���ַ�",20);
		JButton jb=new JButton("ȷ��");
		
		//JCheckBox jcb1=new JCheckBox("ϲ������");
		//JCheckBox jcb2=new JCheckBox("ϲ������");
		//JCheckBox jcb3=new JCheckBox("ϲ������");
		JCheckBox []hobby={new JCheckBox("ϲ������"),new JCheckBox("ϲ������"),new JCheckBox("ϲ������")};
		
		JRadioButton jrb1=new JRadioButton("��");
		JRadioButton jrb2=new JRadioButton("Ů");
		ButtonGroup bg=new ButtonGroup();  //��ť��
		bg.add(jrb1);
		bg.add(jrb2);
		
		String []options={"�������","��������","ѧϰ��԰"};
		JComboBox<String> faceCombo = new JComboBox<String>(options);//�����б�
		//faceCombo.addItem("�������");
		//faceCombo.addItem("��������");
		
		JTextArea jta=new JTextArea(3,15);
		
		//�����������
		jp1.add(jl1);		
		jp1.add(jtf);
		jp1.add(jl2);
		jp1.add(jb);
		
		jp2.add(jl3);
		jp2.add(hobby[0]);
		jp2.add(hobby[1]);
		jp2.add(hobby[2]);
		
		
		jp3.add(jl4);
		jp3.add(jrb1);
		jp3.add(jrb2);
		
		jp3.add(jl5);
		jp3.add(faceCombo);
		
		jp4.add(jl6);
		jp4.add(jta);
		
		//�����嵽���壨��ܣ�
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);
		
		//����contentPane����		
		this.setLayout(new GridLayout(4,1,1,2));
		
		this.setTitle("swing����");
		
		this.setSize(500, 300);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
