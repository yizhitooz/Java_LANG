package swingGUI;
/*
 *  swing�����������������������������ӵ�JPanel����ϣ��ٽ�JPanel�����ӵ�JFrame������
 * JpanelĬ�ϲ�����ʽ����
 */
import java.awt.*;
import javax.swing.*;

public class Demo3_2 extends JFrame{

	//����������
	JLabel jl1=null;
	JLabel jl2=null;
	JLabel jl3=null;
	JTextField jtf=null;
	JButton jb=null;	
	
	//����������
	JPanel jp=null;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_2 js=new Demo3_2();
	}

	public Demo3_2(){
		
		//����������
		jp=new JPanel();
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
		
		JTextArea jta=new JTextArea(5,15);
		
		//�����������
		jp.add(jl1);		
		jp.add(jtf);
		jp.add(jl2);
		jp.add(jb);
		jp.add(jl3);
		jp.add(hobby[0]);
		jp.add(hobby[1]);
		jp.add(hobby[2]);
		
		
		jp.add(jl4);
		jp.add(jrb1);
		jp.add(jrb2);
		
		jp.add(jl5);
		jp.add(faceCombo);
		
		jp.add(jl6);
		jp.add(jta);
		
		//�����嵽���壨��ܣ�
		this.add(jp);
		
		this.setTitle("swing����");
		this.setSize(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
