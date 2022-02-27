package ch03.ex04;

public class Ex042 {
	public static void main(String[] args) {

		Pot myPot = new Pot(30);
		Pot childPot = new Pot(20);
		
		childPot.heat();

		myPot.pour();
		myPot.pour();

		System.out.println("[自分用のポット]");
		myPot.show();
		System.out.println("[子供用のポット]");
		childPot.show();
	}
}
