package ch04.ex04;

public abstract class Graphic {

	private String color;

	public String getColor(){
		return color;
	}
	
	public void setColor( String color ){
		this.color = color;
	}
	
	public abstract String getName();
	
	public abstract double calcArea();
	
	public abstract double calcGirth();
	
}