package ch03.ex10;

public class Ex10 {
	public static void main(String[] args) {
		Graphic graphic1 = new Graphic();
		graphic1.print();
		System.out.println();
		
		System.out.println("正方形の長さ５");
		Graphic graphic2 = new Graphic(5);
		graphic2.print();
		System.out.println();
		
		System.out.println("正方形の文字＠長さ7");
		Graphic graphic3 = new Graphic("@", 7);
		graphic3.print();
	}
}