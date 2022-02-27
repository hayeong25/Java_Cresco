package ch05.ex01;

public class Triangle implements Shape {
	private double base; // 底辺

	private double height; // 高さ

	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}

	public double getArea() {
		return base * height / 2;
	}

	public String getName() {
		return "三角形";
	}
}