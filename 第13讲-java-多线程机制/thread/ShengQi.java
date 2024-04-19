package 升旗;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;
public class ShengQi extends JFrame implements Runnable{	
	HongQi hq=new HongQi(200,400);	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShengQi sq=new ShengQi();
		Thread th=new Thread(sq);
		th.start();
	}
	
	public ShengQi(){
		
		this.setSize(600, 600);
		this.setLocation(200,0);
		
		this.setVisible(true);
				
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//if (hq.y0>1)
				hq.y0=hq.y0-5;
			//else break;
			repaint();
		}
	}
	public void paint(Graphics g){
		super.paint(g);
		Image im=(new ImageIcon("src/images/hongqi.gif")).getImage(); 		
		g.drawImage(im, hq.x0, hq.y0,200,200,this);
	}	
//	class MyPanel extends JPanel  {
//		HongQi hq;
//		public MyPanel(HongQi hq){
//			this.hq=hq;
//		}
//		public void paint(Graphics g){
//			super.paint(g);
//			Image im=(new ImageIcon("src/images/hongqi.gif")).getImage(); 		
//			g.drawImage(im, hq.x0, hq.y0,200,200,this);
//		}	
//	}
}

class HongQi{
	int x0; //红旗的初始位置
	int y0; //红旗的初始位置
	public HongQi(int x0,int y0){
		this.x0=x0;
		this.y0=y0;
	}
}

	
