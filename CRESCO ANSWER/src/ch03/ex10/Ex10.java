package ch03.ex10;

public class Ex10 {
	public static void main(String[] args) {
		Graphic graphic1 = new Graphic();
		graphic1.print();

		System.out.println("コンストラクタで幅を指定。");
		Graphic graphic2 = new Graphic(5);
		graphic2.print();

		System.out.println("コンストラクタで文字と幅を指定。");
		Graphic graphic3 = new Graphic("+", 7);
		graphic3.print();
	}
}
