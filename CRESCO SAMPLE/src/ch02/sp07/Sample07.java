package ch02.sp07;

public class Sample07 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			System.out.println("実行回数:" + i);
		}
		// ここでは変数 i は参照できない 
		// System.out.println(i);
	}
}
