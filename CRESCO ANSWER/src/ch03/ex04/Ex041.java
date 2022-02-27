package ch03.ex04;

public class Ex041 {
	public static void main(String[] args) {

		Pot pot = new Pot(50);
		pot.heat();

		int cup;
		cup = pot.pour();
		cup += pot.pour();
		cup += pot.pour();

		pot.show();
		System.out.println("使用した水量:" + cup + "リットル");
	}
}
