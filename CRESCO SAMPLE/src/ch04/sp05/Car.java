package ch04.sp05;

public class Car {
	private String number;

	private int gas;

	public Car(String n, int g) {
		number = n;
		gas = g;
	}

	@Override
	public String toString() {
		String str = "本車のナンバーは" + number + "、残燃料は" + gas + "です";
		return str;
	}
}
