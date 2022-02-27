package ch03.ex02;

public class Ex02 {
	public static void main(String[] args) {
		Pot pot = new Pot();
		pot.amount = 50;
		while (pot.temperature < 100.0) {
			pot.heat();
		}
		pot.show();
	}
}