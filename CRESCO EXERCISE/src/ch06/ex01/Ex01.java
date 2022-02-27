package ch06.ex01;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("開始");
		Triangle t1 = new Triangle(10, 20, 30);
		Triangle t2 = new Triangle(5, -5, 5);
		Triangle t3 = new Triangle(3,  4, 5);
		t3.calcArea();
		System.out.println("周囲の長さ：" + t3.calcGirth() );
		System.out.println("終了");
	}
}