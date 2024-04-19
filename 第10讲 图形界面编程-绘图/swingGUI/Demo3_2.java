package swingGUI;
/*
 *  swing——添加组件（三）：将基本组件添加到JPanel面板上，再将JPanel面板添加到JFrame容器中
 * Jpanel默认采用流式布局
 */
import java.awt.*;
import javax.swing.*;

public class Demo3_2 extends JFrame{

	//定义基本组件
	JLabel jl1=null;
	JLabel jl2=null;
	JLabel jl3=null;
	JTextField jtf=null;
	JButton jb=null;	
	
	//定义面板组件
	JPanel jp=null;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_2 js=new Demo3_2();
	}

	public Demo3_2(){
		
		//创建面板组件
		jp=new JPanel();
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
		
		JTextArea jta=new JTextArea(5,15);
		
		//添加组件到面板
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
		
		//添加面板到窗体（框架）
		this.add(jp);
		
		this.setTitle("swing窗体");
		this.setSize(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
