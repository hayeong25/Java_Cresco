package ch03.ex04;

class Pot {
	double temperature;

	int amount;

	void heat() {
		temperature = temperature + 20;
	}

	void show() {
		System.out.println("現在の温度：" + temperature + "度");
		System.out.println("現在の水量：" + amount + "リットル");
	}

	int pour() {
		amount = amount - 10;
		return 10;
	}

	void feed(int a) {
		amount = amount + a;
	}
}
