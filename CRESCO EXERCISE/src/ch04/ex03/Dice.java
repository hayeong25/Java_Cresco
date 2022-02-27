package ch04.ex03;

public class Dice {
	public int roll() {
		int spot = (int) ((Math.random() * 6) + 1);
		return spot;
	}
}