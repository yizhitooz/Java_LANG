package swingGUI;
import java.awt.*;
import javax.swing.*; //����Ҫʹ��JFrame��
import javax.swing.JFileChooser.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class ManyComponts extends JFrame{
	public  ManyComponts() {
	       super("My Second JFrame");
	       setDefaultCloseOperation(EXIT_ON_CLOSE);  
	       
	      // setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManyComponts  f = new  ManyComponts();
		f.setTitle("ѧ����Ϣ����ϵͳ");
		f.setSize(350,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con=f.getContentPane();
		JPanel pan=new JPanel();
		
		
		JLabel stuName=new JLabel("����");
		ImageIcon ii=new ImageIcon("java.gif");
		JLabel label2=new JLabel(ii);
		
		//�����ı��༭��JTextField
		JTextField tf_name=new JTextField(10);
		
		//������JPasswordField
		JLabel miMa=new JLabel("����");
		JPasswordField password=new JPasswordField(10);
		password.setEchoChar('*');
		
		JLabel sex=new JLabel("�Ա�",ii,JLabel.CENTER);
		//��ѡ��ťJRadioButton
		JRadioButton  male = new JRadioButton("��", true);
		JRadioButton  fmale = new JRadioButton("Ů", true);
		ButtonGroup group=new ButtonGroup();
		group.add(male);
		group.add(fmale);
		//��ѡ��JCheckBox
		JLabel hob=new JLabel("����");
		JCheckBox []hobby={new JCheckBox("����"),new JCheckBox("����"),new JCheckBox("�滭")};
		hobby[0].setSelected(true);
		
		JButton b_sub=new JButton("ȷ��");		
		JButton b_save=new JButton("����");
		
        //�б��JList
		JLabel xk=new JLabel("ѡ��");
		String []courseName={"���ݽṹ","����ԭ��","Java�������","�ֲ�ʽϵͳ��������"};
		JList course=new JList(courseName);
		
		//�����б��JComboBox
		JLabel yx=new JLabel("Ժϵ");
		String []departmentName={"���������Ϣ��ȫѧԺ","������Ϣ����","�Զ���"};
		JComboBox department=new JComboBox(departmentName);
		
		JLabel l_jg=new JLabel("¼����");
		
		//�����ı��༭JTextArea
		JTextArea result=new JTextArea(10,20);		
		JScrollPane sp=new JScrollPane(result); //�ı�����й�����
		
		//������JSlider
		//�ӷ�ѡ����û�����ʵ��
		JLabel jf=new JLabel("�ӷ�");
		JSlider addition=new JSlider(JSlider.HORIZONTAL,0,100,50);
		addition.setMajorTickSpacing(10); //���̶ȼ��
		addition.setMinorTickSpacing(5);  //�ο̶ȼ��
		addition.setPaintTicks(true);  //��ʾ�̶���
		addition.setPaintLabels(true); //��ʾ�̶�ֵ����ǩ��
		addition.setSnapToTicks(true); //���飨��������ʾ��ֵ������Ϊ����û����û��鴦�Ŀ̶ȱ�ǵ�ֵ��
		
		//������
		JProgressBar progbar=new JProgressBar(JProgressBar.HORIZONTAL,0,100);
		progbar.setStringPainted(true);
		
		/*
		//�ļ�ѡ����JFileChooser
		String directory="D:\\Java\\workspace\\Example\\src\\gui\\image";
		JFileChooser chooser = new JFileChooser(directory);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images & png", "jpg", "gif","png");
	    chooser.setFileFilter(filter);
	    int returnVal = chooser.showOpenDialog(f);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
	    }
		*/
		
		//ʹ�����񲼾�
		CardLayout cl = new CardLayout();
		//pan.setLayout(cl);
				
	    pan.add(stuName);	   
		pan.add(tf_name);
		pan.add(label2);
		
		pan.add(miMa);
		pan.add(password);
		
		pan.add(sex);
		pan.add(male);
		pan.add(fmale);
		
		pan.add(hob);
		pan.add(hobby[0]);
		pan.add(hobby[1]);
		pan.add(hobby[2]);
		
		pan.add(xk);
		pan.add(course);
		
		pan.add(yx);
		pan.add(department);
		
		pan.add(l_jg);
		pan.add(sp); 
		
		pan.add(addition);
		
		pan.add(progbar);
		
		pan.add(b_sub);
		pan.add(b_save); 		
		
		//pan.add(chooser);
		
		con.add(pan);
		f.setVisible(true);
	}

}
