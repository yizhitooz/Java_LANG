package thread;
/**
 *   日程提醒
 *  显示当前时间，每个10分钟提醒一次
 */
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Thread08 extends JFrame{
	//
	JLabel jl1=null;
	JLabel jl2=null;
	static JTextArea jta1=null;
	static JTextArea jta2=null;
	JPanel jp1=null;
	JPanel jp2=null;
	JScrollPane jsp1=null;
	JScrollPane jsp2=null;
	MyClock c=null;
	
	public static void main(String[] arg){
		Thread08 jf=new Thread08();
		MyClock c=new MyClock();			
		Thread th1=new Thread(new MyThread1(c,0));
		//Thread th2=new Thread(new MyThread2(c,0));
		th1.start();
		//th2.start();
	}
	public Thread08(){
		jl1=new JLabel("当前时间");
		jl2=new JLabel("日程提示");
		
		jta1=new JTextArea(100,100);
		jta1.setBorder(BorderFactory.createLoweredBevelBorder());
		jta2=new JTextArea(100,100);
		jta2.setFont(new Font("黑体",Font.ITALIC,12));
		jta2.setText("每过10分钟提醒一次：\r\n");
		jta2.setBorder(BorderFactory.createLoweredBevelBorder());
		
		jsp1=new JScrollPane(jta1);
		jsp2=new JScrollPane(jta2);
		
		this.setSize(600,400);
		this.setLayout(null);
		
		jl1.setBounds(50, 10, 100, 30);
		jl2.setBounds(350, 10, 100, 30);
		jta1.setBounds(20, 45, 250, 250);
		jsp1.setBounds(20, 45, 250, 250);
		jta2.setBounds(300, 45, 250, 250);
		jsp2.setBounds(300, 45, 250, 250);
		this.add(jl1);
		this.add(jl2);
		this.add(jsp1);
		this.add(jsp2);
		
		this.setVisible(true);
	}
	
	
}
class MyClock{
    
	Calendar cal=null;
	int y=0;  //年
	int m=0;  //月
	int d=0;  //日
	int h=0;  //小时
	int min=0;  //分
	int s=0;  //秒
	String str=null;	
	public void getTime(){		
		cal=Calendar.getInstance();
		y=cal.get(Calendar.YEAR);
		m=cal.get(Calendar.MONTH);
		d=cal.get(Calendar.DATE);
		h=cal.get(Calendar.HOUR);
		min=cal.get(Calendar.MINUTE);
		s=cal.get(Calendar.SECOND);			
		
		str=String.valueOf(y)+"年"+String.valueOf(m)+"月"+String.valueOf(d)+"日"+String.valueOf(h)+"小时"+String.valueOf(min)
		       +"分"+String.valueOf(s)+"秒";
		//System.out.println(str);		
	}	
}
//显示时间
class MyThread1 implements Runnable{
	MyClock c=null;	
	int time;
	public MyThread1(MyClock c,int time){
		this.c=c;
		this.time=time;		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//System.out.println("******");			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c.getTime();
			if (c.min%10==0 && c.s==0)
				Thread08.jta2.append(c.str+"\t整点"+"\r\n");
			Thread08.jta1.append(c.str+"\r\n");				
		}		
	}	
}

//日程提示
//class MyThread2 implements Runnable{
//    MyClock c=null;	
//    int time;    
//	public MyThread2(MyClock c,int time){
//		this.c=c;		
//		this.time=time;	
//	}
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		while (true){		
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}						
//			c.getTime();
//			Thread08.jta2.append(c.str+"\r\n");			
//		}
//	}	
//}
