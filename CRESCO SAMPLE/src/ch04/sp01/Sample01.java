package ch04.sp01;

public class Sample01 {
	public static void main(String[] args) {
		PatrolCar pCar = new PatrolCar(true);

		pCar.fuel(20);
		pCar.speedUp();
		pCar.speedUp();

		pCar.offSiren();

		System.out.println("パトカーはスピード " + pCar.getSpeed() + " km/h で走行中です");
		System.out.println("残燃料は " + pCar.getGas() + " リットルです");

		if (pCar.getSiren()) {
			System.out.println("サイレンを鳴らしています");
		} else {
			System.out.println("サイレンは鳴らしていません");
		}
	}
}
