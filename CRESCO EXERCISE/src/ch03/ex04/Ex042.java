package ch03.ex04;

public class Ex042 {
	public static void main(String[] args) {
		Pot mypot = new Pot();
		Pot childpot = new Pot();
		
		mypot.amount = 30;
		childpot.amount = 20;
		
		while(childpot.temperature < 20.0) {
			childpot.heat();
		}
		
		mypot.pour();
		mypot.pour();
		
		System.out.println("[自分用のポット]");
		mypot.show();
		System.out.println("[子供用のポット]");
		childpot.show();
	}
}