package swingGUI;
/*
 *  swing——添加组件（三）：将基本组件添加到JPanel面板上，再将JPanel面板添加到JFrame容器中
 *  JPanel默认采用流式布局
 */
import java.awt.*;
import javax.swing.*;

public class Demo3_3 extends JFrame{

	//定义基本组件
	JLabel jl1=null;
	JLabel jl2=null;
	JLabel jl3=null;
	JTextField jtf=null;
	JButton jb=null;	
	
	//定义面板组件
	JPanel jp1=null;
	JPanel jp2=null;
	JPanel jp3=null;
	JPanel jp4=null;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_3 js=new Demo3_3();
	}

	public Demo3_3(){
		
		//创建面板组件
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
		//创建其它组件		
		JLabel jl1=new JLabel("文本框：");
		JLabel jl2=new JLabel("按钮:");
		JLabel jl3=new JLabel("选择框:");
		JLabel jl4=new JLabel("单选按钮:");
		JLabel jl5=new JLabel("下拉列表:");
		JLabel jl6=new JLabel("文本区:");
		JTextField jtf=new JTextField("请输入,不超过20个字符",20);
		JButton jb=new JButton("确定");
		
		//JCheckBox jcb1=new JCheckBox("喜欢音乐");
		//JCheckBox jcb2=new JCheckBox("喜欢旅游");
		//JCheckBox jcb3=new JCheckBox("喜欢篮球");
		JCheckBox []hobby={new JCheckBox("喜欢音乐"),new JCheckBox("喜欢旅游"),new JCheckBox("喜欢篮球")};
		
		JRadioButton jrb1=new JRadioButton("男");
		JRadioButton jrb2=new JRadioButton("女");
		ButtonGroup bg=new ButtonGroup();  //按钮组
		bg.add(jrb1);
		bg.add(jrb2);
		
		String []options={"音乐天地","足球世界","学习乐园"};
		JComboBox<String> faceCombo = new JComboBox<String>(options);//下列列表
		//faceCombo.addItem("音乐天地");
		//faceCombo.addItem("足球世界");
		
		JTextArea jta=new JTextArea(3,15);
		
		//添加组件到面板
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
		
		//添加面板到窗体（框架）
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);
		
		//设置contentPane布局		
		this.setLayout(new GridLayout(4,1,1,2));
		
		this.setTitle("swing窗体");
		
		this.setSize(500, 300);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
