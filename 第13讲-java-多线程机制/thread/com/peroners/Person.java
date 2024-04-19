package comm.peroners;
class Person {
	private String name;
	private char sex;
	boolean bFull=false;
	public synchronized void get() {    
		if (bFull==false){
			try {
				wait();   //bFull为false时，必须等待Write线程写入数据并唤醒此线程。
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("姓名："+name+"\t性别："+sex);
      	bFull=false;  //读完数据后，将bFull设为false
      	notifyAll();  //唤醒其它在等待的线程
	}
	
	public synchronized void setName(String name,char sex) {
		if (bFull==true){
			try {
				wait();  //bFull为true时，必须等待Read线程读完数据并唤醒此线程。
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//写数据
		this.name=name;
		this.sex=sex;
		bFull=true;   //写完数据后，将bFull设为true
		notifyAll();  //唤醒其它在等待的线程
	}
}
class Write extends Thread{
	private Person person;
	public Write(Person s) {
		person=s;
	}
	public void run() {
		for (int i=0; i<4; i++) {		   
			try {
				sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) {}
			if (i%2==0)
				person.setName("Mike",'M');
			else
				person.setName("Shalary",'F');
		}
	}
}
class Read extends Thread {
	 private Person person; 
	 public Read(Person s) {
	 	person=s; 
	 }
	 public void run() { 
		 for (int i=0; i<4; i++) {
			 person.get();
			 try {
				sleep((int)(Math.random() * 100));
			 } catch (InterruptedException e) {}
		 }
	 }
}


