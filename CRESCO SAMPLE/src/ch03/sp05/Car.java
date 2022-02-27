package ch03.sp05;

public class Car {
	private String number;

	private int gas;

	public Car(String n) {
		number = n;
		gas = 40;
	}

	public Car(String n, int g) {
		number = n;
		gas = g;
	}

	public String getNumber() {
		return number;
	}

	public int getGas() {
		return gas;
	}
}
