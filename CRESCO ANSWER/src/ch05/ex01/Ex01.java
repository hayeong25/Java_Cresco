package ch05.ex01;

public class Ex01 {
	public static void main(String[] args) {
		Shape s = new Triangle(5, 3);
		String name = s.getName();
		System.out.println(name + "の面積は " + s.getArea() + "です。");
	}
}
