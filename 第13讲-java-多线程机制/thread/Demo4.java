package io.test1.小球跳动.test1;
import java.awt.BorderLayout;
/*
 * 画小球、直线
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class Demo4 extends JPanel implements Runnable{
	//成员变量
	Ball ball=null;
	double t=0;
	
	public Demo4(){
		ball=new Ball();
		ball.setX(10);
		ball.setY(10);		
		this.setBackground(Color.BLACK);
	}
	
	public void paint(Graphics g){		   
		Graphics2D g2=(Graphics2D)g;
		super.paint(g);
		g2.setColor(Color.WHITE);
		Ellipse2D circle=new Ellipse2D.Double(ball.getX(), ball.getY(), 10, 10);
		g2.fill(circle);
		g2.drawLine(0, 290, 600, 290);
		//g.setColor(Color.WHITE);
		//g.drawOval(ball.getX(), ball.getY(), 10, 10);
	}
	
	public static void main(String[] arg){
		JFrame jf=new JFrame("小球跳动");
		jf.setSize(600, 400);
		Demo4 dp=new Demo4();
		Thread th=new Thread(dp);	
		
		jf.add(dp,BorderLayout.CENTER);
		th.start();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int up=0;
		double t=0.1; //单位间隔
		double v=0; //初始速度
		double x=ball.getX();
		double y=ball.getY();
		while (true){
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			v=v+9.8*t;
			if (x<599){
				if (up==0){
					if (y>=275)
						up=1;
					y=y+v*t/2;
				}
				else{
					if (up==1){
						if (y<=10+x/2)
							up=0;
						y=y-v*t/2;
					}
				}
				if (y>280)
					y=280;
			}	
			else
				break;
			x=x+1;
			System.out.println(x+" ; "+y);		
			ball.setX(x);
			ball.setY(y);
			repaint();
		}
	}
}


class Ball{
	private  double x;
	private double y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}	
}