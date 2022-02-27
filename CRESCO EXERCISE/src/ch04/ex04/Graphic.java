package ch04.ex04;

abstract class Graphic {
	String color;
	String name;
	int area;
	int girth;
	
	String setColor(String color) {
		this.color = color;
		return color;
	}
	
	String getColor() {
		return color;
	}	
	
	abstract String getName();
	abstract double calcArea();
	abstract double calcGirth();
}