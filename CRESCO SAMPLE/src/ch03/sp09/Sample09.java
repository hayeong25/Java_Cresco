package ch03.sp09;

public class Sample09 {
	public static void main(String[] args) {
		Car myCar = new Car("東京わ55-11");
		Car hisCar = new Car("京都れ19-77", 100);
		System.out.println("現在の生産台数は" + Car.total);
	}
}
