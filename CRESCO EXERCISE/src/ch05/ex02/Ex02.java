package ch05.ex02;

public class Ex02 {
	public static void main(String[] args) {
		Shape t1 = new Triangle(5, 3);
		printShape(t1);
		Shape t2 = new Trapezoid(10, 20, 5);
		printShape(t2);
	}
	
	public static void printShape(Shape s){
		String name = s.getName();
		System.out.println(name + "の面積は " + s.getArea() + "です。");
	}
}