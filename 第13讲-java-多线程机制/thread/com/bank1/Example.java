package thread.com.tongbu.bank1;

public class Example {

	private static final Object[] Thread = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account(5000,"Max");
		
		Drawing dr1=new Drawing(account,300,"取钱");
		Reserving rs=new Reserving(account,600,"存钱");
		
		dr1.start();
		rs.start();

//		Thread t1=new Thread(dr1);
//		Thread t2=new Thread(dr1);
//		t1.start();
//		t2.start();
	}

}
//账户
class Account{
	float money;//余额
	String name;//卡名
	public Account(float money,String name){
		this.money=money;
		this.name=name;
	}
}
//银行：模拟取款
class Drawing extends Thread{
	Account account;
	//取钱数额
	float drawingmoney;
	
	public Drawing(Account account,float drawingmoney,String name){
		super(name);
		this.account=account;
		this.drawingmoney=drawingmoney;
	}
	@Override
	public void run(){
		synchronized(account){
			//判断剩余钱够不够
			if (account.money-drawingmoney<0){
				System.out.println(Thread.currentThread().getName()+", 钱不够，取不了");
				return;
			}
			
			//sleep可以放大问题发生性
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//卡余额
			for (int i=0;i<10;i++){
				account.money-=drawingmoney/10;
				System.out.println(Thread.currentThread().getName()+"  "+account.name+" 余额为 "+account.money);
			}
		}
		
	}
}
//银行：模拟存款
class Reserving extends Thread{
	Account account;
	//要存的数额
	float reservingmoney;
	
	public Reserving(Account account,float reservingmoney,String name){
		super(name);
		this.account=account;
		this.reservingmoney=reservingmoney;
	}
	@Override
	public void run(){
		synchronized(account){
			
			
			//sleep可以放大问题发生性
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//卡余额
			for (int i=0;i<10;i++){ //分10次存进一笔钱。比如在存钱过程中因为其它暂时事打扰，应等这个人存完，不允许别人操作。
				account.money+=reservingmoney/10;
				System.out.println(Thread.currentThread().getName()+"  "+account.name+" 余额为 "+account.money);
			}
		}
		
	}
}
