package ch04.sp01;

public class Car {
	private String number;

	private int speed;

	private int gas = 20;

	public Car() {
		number = "なし";
		speed = 0;
		gas = 40;
	}

	public String getNumber() { // ナンバーを取得する
		return number;
	}

	public void fuel(int amount) { // 燃料を補給する
		gas = gas + amount;
	}

	public int getGas() { // 燃料の残量を取得する
		return gas;
	}

	public void speedUp() { // 加速する
		speed += 10;
	}

	public int getSpeed() { // 現在のスピードを取得する
		return speed;
	}
}
