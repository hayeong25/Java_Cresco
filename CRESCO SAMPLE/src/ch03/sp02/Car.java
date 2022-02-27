package ch03.sp02;

class Car {
	String number;

	int speed;

	int gas = 20;

	void showCar() { // 車の情報を表示する
		System.out.println("ナンバーは " + number + " です");
		System.out.println("スピードは " + speed + " km/h です");
		System.out.println("残燃料は " + gas + " リットルです");
	}

	void speedUp() { // 加速する
		speed = speed + 10;
	}

	void fuel(int amount) { // 燃料を補給する
		gas = gas + amount;
	}

	void setNumber(String num) { // ナンバーを交換する
		number = num;
	}

	int getGas() { // 燃料の残量を取得する
		return gas;
	}

	String getNumber() { // ナンバーを取得する
		return number;
	}

}
