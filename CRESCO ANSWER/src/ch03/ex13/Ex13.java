package ch03.ex13;

public class Ex13 {
	public static void main(String[] args) {
		ParkingLot pLot = new ParkingLot(3);
		Car c1 = new Car("東京わ55-11");
		Car c2 = new Car("大阪か22-77",100);
		Car c3 = new Car("神戸こ46-49");
		Car c4 = new Car("愛知た59-63",50);
		
		pLot.putIn(c1);
		pLot.getOut(1);
		Car c5 = pLot.getOut(0);
		pLot.putIn(c2);
		pLot.putIn(c3);
		pLot.putIn(c4);
		pLot.putIn(c5);
		pLot.getOut(3);
	}
}
