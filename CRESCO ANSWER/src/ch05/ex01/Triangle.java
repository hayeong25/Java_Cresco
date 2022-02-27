package ch05.ex01;

public class Triangle implements Shape {
	private double base; // 底辺

	private double height; // 高さ

	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}

	@Override
	public double getArea() {
		return base * height / 2;
	}

	@Override
	public String getName() {
		return "三角形";
	}

}
