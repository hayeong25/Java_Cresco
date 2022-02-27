package ch03.ex09;

public class Pot {
	private double temperature;

	private int amount;

	public Pot(int a) {
		if (a > 0) {
			amount = a;
		}
	}

	public Pot(int a, double t) {
		if (a > 0) {
			amount = a;
		}
		if (0 <= t && t <= 100) {
			temperature = t;
		}
	}

	public void heat() {
		if (temperature >= 80) {
			temperature = 100;
		} else {
			temperature = temperature + 20;
		}
	}

	public void show() {
		System.out.println("現在の温度：" + temperature + "度");
		System.out.println("現在の水量：" + amount + "リットル");
	}

	public int pour() {
		int useAmount = 10;
		if (amount < 10) {
			useAmount = amount;
			amount = 0;
		} else {
			amount = amount - useAmount;
		}
		return useAmount;
	}

	public void feed(int a) {
		if (a > 0) {
			amount = amount + a;
		}
	}
}
