package ch03.sp02;

public class Sample02 {
	public static void main(String[] args) {
		Car hisCar = new Car();
		
		hisCar.setNumber("東京わ55-11");
		hisCar.speedUp();
		hisCar.fuel(10);
		hisCar.speedUp();

		hisCar.showCar();

		hisCar.fuel(20);
		int gas = hisCar.getGas();
		System.out.println("燃料補給して燃料は" + gas + "リットルになりました");
	}
}

