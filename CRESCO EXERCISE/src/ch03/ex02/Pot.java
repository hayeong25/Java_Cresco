package ch03.ex02;

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
}