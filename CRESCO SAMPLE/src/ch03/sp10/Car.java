package ch03.sp10;

public class Car {
	private static int total = 0;

	private String number;

	private int gas;

	public Car(String n) {
		this(n, 40);
	}

	public Car(String n, int g) {
		number = n;
		gas = g;
		total++;
	}

	public static int getTotal() {
		return total;
	}
}
