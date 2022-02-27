package ch03.sp03;

public class Sample03 {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setNumber("大阪か55-11");
		myCar.showCar();

		GasStation aStation = new GasStation();
		aStation.fillGas(myCar);

		myCar.showCar();
	}
}


