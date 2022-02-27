package ch03.sp07;

public class Car {
	private String number;

	private int gas;

	public Car(String number) {
		this(number, 40);
	}

	public Car(String number, int gas) {
		this.number = number;
		this.gas = gas;
	}

	public String getNumber() {
		return number;
	}

	public int getGas() {
		return gas;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
