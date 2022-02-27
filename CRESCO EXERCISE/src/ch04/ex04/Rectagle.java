package ch04.ex04;

class Rectangle extends Graphic {
	double x;
	double y;
	
	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	String getName() {
		return "長方形";
	}

	@Override
	double calcArea() {
		return x * y;
	}

	@Override
	double calcGirth() {
		return 2 * (x + y);
	}
}