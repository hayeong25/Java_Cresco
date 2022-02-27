package ch04.ex04;

public class Circle extends Graphic {
	private double radius; // 半径

	private final double PI = 3.14;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public String getName(){
		return "円";
	}

	@Override
	public double calcArea() {
		return (PI * radius * radius);
	}

	@Override
	public double calcGirth() {
		return (2 * PI * radius);
	}

}
