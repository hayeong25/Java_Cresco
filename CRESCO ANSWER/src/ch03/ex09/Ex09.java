package ch03.ex09;

public class Ex09 {
	public static void main(String[] args) {
		Pot pot = new Pot(70, 50);

		int cup = 0;
		for (int i = 0; i < 10; i++) {
			cup += pot.pour();
		}
		pot.show();
		System.out.println("使用した水量:" + cup + "リットル");
	}
}
