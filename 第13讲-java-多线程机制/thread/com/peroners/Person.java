package comm.peroners;
class Person {
	private String name;
	private char sex;
	boolean bFull=false;
	public synchronized void get() {    
		if (bFull==false){
			try {
				wait();   //bFullΪfalseʱ������ȴ�Write�߳�д�����ݲ����Ѵ��̡߳�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("������"+name+"\t�Ա�"+sex);
      	bFull=false;  //�������ݺ󣬽�bFull��Ϊfalse
      	notifyAll();  //���������ڵȴ����߳�
	}
	
	public synchronized void setName(String name,char sex) {
		if (bFull==true){
			try {
				wait();  //bFullΪtrueʱ������ȴ�Read�̶߳������ݲ����Ѵ��̡߳�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//д����
		this.name=name;
		this.sex=sex;
		bFull=true;   //д�����ݺ󣬽�bFull��Ϊtrue
		notifyAll();  //���������ڵȴ����߳�
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


