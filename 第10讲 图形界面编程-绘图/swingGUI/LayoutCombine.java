package swingGUI;
/*
 *    多种布局管理器相结合
 */
import java.awt.*;
import javax.swing.*;
public class LayoutCombine extends JFrame{

	//定义组件
	JPanel jp1,jp2;
	JButton []jbs=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LayoutCombine mulLayout=new LayoutCombine();
	}
	
	//构造函数
	public LayoutCombine(){
		//创建组件
		jp1=new JPanel();  //JPanel默认为流式布局
		jp2=new JPanel();
		
		jbs=new JButton[6];
		for (int i=0;i<6;i++){
			jbs[i]=new JButton(String.valueOf(i+1));
		}	
		
		//设置布局
		//this.setLayout(new BorderLayout());
		
		//添加组件
		jp1.add(jbs[0]);
		jp1.add(jbs[1]);
		this.add(jp1, BorderLayout.NORTH);
		this.add(jbs[2],BorderLayout.CENTER);
		jp2.add(jbs[3]);
		jp2.add(jbs[4]);
		jp2.add(jbs[5]);
		this.add(jp2,BorderLayout.SOUTH);
		
		//设置窗体属性
		this.setTitle("多种布局");
		this.setSize(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //禁止用户改变窗口大小
				
				
		//显示窗体
		this.setVisible(true);	
	}

}
