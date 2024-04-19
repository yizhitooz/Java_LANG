package swingGUI;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * 事件处理
 * 计算器
 */
import javax.swing.*;

//事件监听类SimpleComputer
public class SimpleComputer extends JFrame implements ActionListener{

	//定义组件
	JPanel jp1=null;
	JPanel jp2=null;
	JTextField jtf1=null;
	JTextField jtf2=null;
	JTextField operator=null;
	JTextField operator1=null;
	JTextField result=null;
	JLabel jl=null;
	JButton jb1=null;
	JButton jb2=null;
	JButton ok=null;
	JButton cancel=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleComputer sc=new SimpleComputer();
	}

	public SimpleComputer(){
		jtf1=new JTextField(10);
		jtf1.setText("0");
		jtf2=new JTextField(10);
		jtf2.setText("0");
		operator=new JTextField(3);
		//operator1=new JTextField(3);
		//operator.setAlignmentY(CENTER_ALIGNMENT);
		jl=new JLabel("=");
		result=new JTextField(10);
		jp1=new JPanel();
		jp1.add(jtf1);
		jp1.add(operator);
		jp1.add(jtf2);
		jp1.add(jl);
		jp1.add(result);
		
		
		jb1=new JButton("+");
		jb2=new JButton("/");
		ok=new JButton("确认");
		cancel=new JButton("删除");
		jp2=new JPanel();
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(ok);
		jp2.add(cancel);
		
		//注册事件源
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		ok.addActionListener(this);
		cancel.addActionListener(this);
		
		//拆分窗格
		JSplitPane jsp=new JSplitPane(JSplitPane.VERTICAL_SPLIT,jp1,jp2);  //右边拆分为上下两部分
		this.add(jsp);
		
		this.setTitle("简单计算器");
		this.setSize(600,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//事件处理方法actionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//String command=e.getActionCommand();
		double x=0,y=0;
		if (e.getActionCommand().equals("/")){
			operator.setText(e.getActionCommand());
			x=Double.parseDouble(jtf1.getText());
			y=Double.parseDouble(jtf2.getText());
			if (Math.abs(y)>0.00001)
				result.setText(String.valueOf(x/y));
		}
		if (e.getActionCommand().equals("+")){
			operator.setText(e.getActionCommand());
			x=Double.parseDouble(jtf1.getText());
			y=Double.parseDouble(jtf2.getText());
			result.setText(String.valueOf(x+y));
		}
		//if (e.getActionCommand().equals("确认"))
			
	}	
}


