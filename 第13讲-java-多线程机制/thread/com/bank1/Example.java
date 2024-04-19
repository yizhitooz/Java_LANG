package thread.com.tongbu.bank1;

public class Example {

	private static final Object[] Thread = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account(5000,"Max");
		
		Drawing dr1=new Drawing(account,300,"ȡǮ");
		Reserving rs=new Reserving(account,600,"��Ǯ");
		
		dr1.start();
		rs.start();

//		Thread t1=new Thread(dr1);
//		Thread t2=new Thread(dr1);
//		t1.start();
//		t2.start();
	}

}
//�˻�
class Account{
	float money;//���
	String name;//����
	public Account(float money,String name){
		this.money=money;
		this.name=name;
	}
}
//���У�ģ��ȡ��
class Drawing extends Thread{
	Account account;
	//ȡǮ����
	float drawingmoney;
	
	public Drawing(Account account,float drawingmoney,String name){
		super(name);
		this.account=account;
		this.drawingmoney=drawingmoney;
	}
	@Override
	public void run(){
		synchronized(account){
			//�ж�ʣ��Ǯ������
			if (account.money-drawingmoney<0){
				System.out.println(Thread.currentThread().getName()+", Ǯ������ȡ����");
				return;
			}
			
			//sleep���ԷŴ����ⷢ����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//�����
			for (int i=0;i<10;i++){
				account.money-=drawingmoney/10;
				System.out.println(Thread.currentThread().getName()+"  "+account.name+" ���Ϊ "+account.money);
			}
		}
		
	}
}
//���У�ģ����
class Reserving extends Thread{
	Account account;
	//Ҫ�������
	float reservingmoney;
	
	public Reserving(Account account,float reservingmoney,String name){
		super(name);
		this.account=account;
		this.reservingmoney=reservingmoney;
	}
	@Override
	public void run(){
		synchronized(account){
			
			
			//sleep���ԷŴ����ⷢ����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//�����
			for (int i=0;i<10;i++){ //��10�δ��һ��Ǯ�������ڴ�Ǯ��������Ϊ������ʱ�´��ţ�Ӧ������˴��꣬��������˲�����
				account.money+=reservingmoney/10;
				System.out.println(Thread.currentThread().getName()+"  "+account.name+" ���Ϊ "+account.money);
			}
		}
		
	}
}
