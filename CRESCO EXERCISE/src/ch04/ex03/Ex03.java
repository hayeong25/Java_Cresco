package ch04.ex03;

public class Ex03 {
	public static void main(String[] args) {
		Dice dice = new Dice();
		FakeDice fakedice = new FakeDice();
		
		int count = 6;
		
		System.out.println("正確なさいころをふります");
		for(int i = 1; i <= count; i++) {
			System.out.println(i + "回目：" + dice.roll());
		}
		
		System.out.println();
		
		System.out.println("インチキさいころをふります");
		for(int i = 1; i <= count; i++) {
			System.out.println(i + "回目：" + fakedice.roll(3));
		}
	}
}