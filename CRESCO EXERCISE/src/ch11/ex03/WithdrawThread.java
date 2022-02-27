package ch11.ex03;

public class WithdrawThread implements Runnable {
	private Account account;
	public WithdrawThread(Account account){
		this.account = account;
	}
	@Override
	public void run() {
		int amount = 1000;
		int balance;
		for(int i=0; i<10; i++) {
			balance = account.withdraw(amount);
			System.out.println("引出金額：" + amount + "円, 残高：" + balance + "円");
		}
	}
}
