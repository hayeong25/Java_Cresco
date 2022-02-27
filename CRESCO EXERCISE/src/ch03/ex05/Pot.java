package ch03.ex05;

class Pot {
	private double temperature;
	private int amount;

	// コンストラクタ
	Pot(int a) {
		if(a >= 0) {
			setAmount(a);
		}
		else {
			setAmount(0);
		}
	}

	// getter & setter
	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	// heat メソッド
	void heat() {
		if((getTemperature() > 0) && (getTemperature() < 100)) {
			setTemperature(getTemperature() + 20);
		}
		else if(getTemperature() >= 100) {
			setTemperature(100);
		}
	}

	// show　メソッド
	void show() {
		System.out.println("現在の温度：" + getTemperature() + "度");
		System.out.println("現在の水量：" + getAmount() + "リットル");
	}

	// pour　メソッド
	int pour() {
		int use = 10;
		if(getAmount() >= 10) {
			setAmount(getAmount() - use);
		}
		else {
			use = getAmount();
			setAmount(0);
		}
		return use;
	}

	// feed メソッド
	void feed(int a) {
		if(a > 0) {
			setAmount(getAmount() + a);
		}
	}
}