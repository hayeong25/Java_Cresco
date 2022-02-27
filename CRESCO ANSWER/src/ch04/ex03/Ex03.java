package ch04.ex03;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("正確なさいころをふります。");
		Dice dice = new Dice();
		int num = 6;
		for (int i = 1; i <= num; i++) {
			System.out.println(i + "回目：　" + dice.roll());
		}
		System.out.println("-----------------------");
		System.out.println("インチキさいころをふります。");
		FakeDice fakeDice = new FakeDice(6);
		for (int i = 1; i <= num; i++) {
			System.out.println(i + "回目：　" + fakeDice.roll());
		}
	}
}
