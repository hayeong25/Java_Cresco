package ch11.ex03;

public class DepositThread implements Runnable {
	private Account account;
	public DepositThread(Account account){
		this.account = account;
	}
	@Override
	public void run() {
		int amount = 1000;
		int  balance;
		for(int i=0; i<10; i++) {
			balance = account.deposit(amount);
			System.out.println("預金金額：" + amount + "円, 残高：" + balance + "円");
		}
	}
}