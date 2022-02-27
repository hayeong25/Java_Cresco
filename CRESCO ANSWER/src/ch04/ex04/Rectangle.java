package ch04.ex04;

public class Rectangle extends Graphic {
	private double width;

	private double height;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public String getName(){
		return "長方形";
	}

	@Override
	public double calcArea() {
		return (width * height);
	}

	@Override
	public double calcGirth() {
		return (2 * (width + height));
	}
}
