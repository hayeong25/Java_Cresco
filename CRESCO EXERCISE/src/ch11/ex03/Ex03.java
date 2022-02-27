package ch11.ex03;

public class Ex03 {
	public static void main(String[] args) {
		Account account = new Account();
		Thread thread1 = new Thread(new DepositThread(account));
		Thread thread2 = new Thread(new WithdrawThread(account));
		
		thread1.start();
		thread2.start();
	}
}