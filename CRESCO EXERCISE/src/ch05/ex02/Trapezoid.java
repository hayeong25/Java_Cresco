package ch05.ex02;

class Trapezoid implements Shape {
	int a;
	int b;
	int h;
	
	public Trapezoid(int a, int b, int h) {
		this.a = a;
		this.b = b;
		this.h = h;
	}

	@Override
	public double getArea() {
		return (a + b) * h / 2;
	}

	@Override
	public String getName() {
		return "台形";
	}
}