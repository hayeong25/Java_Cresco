package ch04.ex04;

class Circle extends Graphic {
	double r;
	final double PI = 3.14;
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	String getName() {
		return "円";
	}

	@Override
	double calcArea() {
		return r * r * PI;
	}

	@Override
	double calcGirth() {
		return 2 * PI * r;
	}
}