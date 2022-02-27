package ch04.sp02;

public class Sample02 {
	public static void main(String[] args) {
		PatrolCar p = new PatrolCar("品川す88ー55", 40);

		System.out.println("パトカーのナンバー: " + p.getNumber());
		System.out.println("残燃料： " + p.getGas());

	}
}
