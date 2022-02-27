package ch03.sp01;

class Car {
	String number;

	int speed;

	int gas = 20;

	void showCar() { // 車の情報を表示する
		System.out.println("ナンバーは " + number + " です");
		System.out.println("スピードは " + speed + " km/hです");
		System.out.println("残燃料は " + gas + " リットルです");
	}

	void speedUp() { // 加速する
		speed = speed + 10;
	}
}
