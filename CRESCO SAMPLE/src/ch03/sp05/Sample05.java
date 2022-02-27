package ch03.sp05;

public class Sample05 {
	public static void main(String[] args) {
		Car myCar = new Car("東京わ55-11");
		System.out.println("私の車");
		System.out.println("ナンバー：" + myCar.getNumber());
		System.out.println("燃料：" + myCar.getGas() );

		System.out.println("");
		
		Car hisCar = new Car("京都れ19-77", 100);
		System.out.println("彼の車");
		System.out.println("ナンバー：" + hisCar.getNumber());
		System.out.println("燃料：" + hisCar.getGas() );
	}
}
