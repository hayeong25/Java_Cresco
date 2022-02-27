package ch07.vehicle;

public class Car {
	private int fuel;

	public Car(int f) {
		fuel = f;
	}

	void showFuel() {
		System.out.println("残燃料は " + fuel + " リットルです");
	}
}
