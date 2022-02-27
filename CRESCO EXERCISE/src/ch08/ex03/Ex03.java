package ch08.ex03;

public class Ex03 {
	public static void main(String[] args) {
		int i1 = 100;
		int i2;
		String s1;
		String s2 = "10";

		s1 = (String) i1; // コンパイルエラー
		i2 = (int) s2; // コンパイルエラー

		System.out.println("数値を文字列に変換すると" + s1 + "です。");
		System.out.println("文字列を数字に変換すると" + i2 + "です。");
	}
}

