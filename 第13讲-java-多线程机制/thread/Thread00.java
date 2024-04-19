package thread.test1;

import java.util.Date;

public class Thread00{
	static Cat1 cat;
    public static void main(String[] args){
    	cat=new Cat1();
    	cat.start();
		System.out.println(Thread.currentThread().getName());
	}    
}
class Cat1 extends Thread{
	public void run(){
		int i=0;
		//System.out.println("Thread...");
		System.out.println(Thread.currentThread().getName());		
	}
}

