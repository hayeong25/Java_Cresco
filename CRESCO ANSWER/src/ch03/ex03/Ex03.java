package ch03.ex03;

public class Ex03 {
	public static void main(String[] args) {
		Pot pot = new Pot();
		pot.feed(50);

		while (pot.temperature < 40.0) {
			pot.heat();
		}

		int cup;
		cup = pot.pour();
		cup += pot.pour();

		pot.show();
		System.out.println("使用した水量:" + cup + "リットル");	
	}
}
