package ch04.ex03;

public class FakeDice extends Dice {
	private int spot;

	public FakeDice(int spot) {
		this.spot = spot;
	}

	@Override
	public int roll() {
		return spot;
	}
}
