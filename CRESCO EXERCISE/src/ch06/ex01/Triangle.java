package ch06.ex01;

public class Triangle {
	private int a;
	private int b;
	private int c;

	public Triangle(int a, int b, int c){
		if((a <= 0) || (b <= 0) || (c <= 0)) {
			throw new IllegalArgumentException("ゼロ以下の値が含まれています");
		}
		if(!(((a + b) > c) && ((b + c) > a) &&((c + a) > b))) {
			throw new IllegalArgumentException(a + ", " + b + ", " + c +"は三角形が成立しないです");
		}
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int calcGirth(){
		return a + b + c;
	}
	
	public int calcArea(){
		// 実装できない
		return -1;
	}
}