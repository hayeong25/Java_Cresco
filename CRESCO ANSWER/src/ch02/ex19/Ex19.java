package ch02.ex19;

public class Ex19 {
	public static void main(String[] args) {
		// 文字列リテラルは、文字の配列ではないため、
		// String型の変数に代入できない。
		// 文字列リテラルである "" の値を代入する必要がある。
		String message = "abc";

		// 文字列は ' ではなく " で囲む必要がある。
		System.out.println("I have a message." + message);
	}
}
