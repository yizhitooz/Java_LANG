package swingGUI;
import java.awt.*;
import javax.swing.*; //后面要使用JFrame类
import javax.swing.JFileChooser.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class ManyComponents extends JFrame{
	public  ManyComponents() {
	       super("My Second JFrame");
	       setDefaultCloseOperation(EXIT_ON_CLOSE);  
	       
	      // setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManyComponents  f = new  ManyComponents();
		f.setTitle("学生信息管理系统");
		f.setSize(350,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con=f.getContentPane();
		JPanel pan=new JPanel();
		
		
		JLabel stuName=new JLabel("姓名");
		ImageIcon ii=new ImageIcon("java.gif");
		JLabel label2=new JLabel(ii);
		
		//单行文本编辑框JTextField
		JTextField tf_name=new JTextField(10);
		
		//密码域JPasswordField
		JLabel miMa=new JLabel("密码");
		JPasswordField password=new JPasswordField(10);
		password.setEchoChar('*');
		
		JLabel sex=new JLabel("性别",ii,JLabel.CENTER);
		//单选按钮JRadioButton
		JRadioButton  male = new JRadioButton("男", true);
		JRadioButton  fmale = new JRadioButton("女", true);
		ButtonGroup group=new ButtonGroup();
		group.add(male);
		group.add(fmale);
		//复选框JCheckBox
		JLabel hob=new JLabel("爱好");
		JCheckBox []hobby={new JCheckBox("音乐"),new JCheckBox("足球"),new JCheckBox("绘画")};
		hobby[0].setSelected(true);
		
		JButton b_sub=new JButton("确认");		
		JButton b_save=new JButton("保存");
		
        //列表框JList
		JLabel xk=new JLabel("选课");
		String []courseName={"数据结构","网络原理","Java程序设计","分布式系统开发技术"};
		JList course=new JList(courseName);
		
		//下拉列表框JComboBox
		JLabel yx=new JLabel("院系");
		String []departmentName={"计算机与信息安全学院","电子信息技术","自动化"};
		JComboBox department=new JComboBox(departmentName);
		
		JLabel l_jg=new JLabel("录入结果");
		
		//多行文本编辑JTextArea
		JTextArea result=new JTextArea(10,20);		
		JScrollPane sp=new JScrollPane(result); //文本框带有滚动条
		
		//滑动条JSlider
		//加分选项，采用滑动条实现
		JLabel jf=new JLabel("加分");
		JSlider addition=new JSlider(JSlider.HORIZONTAL,0,100,50);
		addition.setMajorTickSpacing(10); //主刻度间距
		addition.setMinorTickSpacing(5);  //次刻度间距
		addition.setPaintTicks(true);  //显示刻度线
		addition.setPaintLabels(true); //显示刻度值（标签）
		addition.setSnapToTicks(true); //滑块（及其所表示的值）解析为最靠近用户放置滑块处的刻度标记的值。
		
		//进度条
		JProgressBar progbar=new JProgressBar(JProgressBar.HORIZONTAL,0,100);
		progbar.setStringPainted(true);
		
		
		//文件选择器JFileChooser
		String directory="D:\\Java\\workspace\\Example\\src\\gui\\image";
		JFileChooser chooser = new JFileChooser(directory);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images & png", "jpg", "gif","png");
	    chooser.setFileFilter(filter);
	    int returnVal = chooser.showOpenDialog(f);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
	    }
		
		
		//使用网格布局
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
