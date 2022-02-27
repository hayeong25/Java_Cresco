package ch05.ex02;

public class Trapezoid implements Shape {
	private double upper_base; // 上底

	private double lower_base; // 下底

	private double height; // 高さ

	public Trapezoid(double a, double b, double h) {
		this.upper_base = a;
		this.lower_base = b;
		this.height = h;

	}

	@Override
	public double getArea() {
		return (upper_base + lower_base) * height / 2;
	}
	
	@Override
	public String getName() {
		return "台形";
	}
}
