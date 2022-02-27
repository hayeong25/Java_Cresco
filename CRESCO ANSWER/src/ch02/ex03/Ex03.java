package ch02.ex03;

public class Ex03 {
	public static void main(String[] args) {
		int a = 12;
		int b = 5;
		int c = 10;

		if (((c - a) < 0 && (b - a) > 0) || ((c - a) > 0 && (b - a) < 0)) {
			System.out.println("中間値は" + a + "です。");
		} else if (((c - b) < 0 && (a - b) > 0) || ((c - b) > 0 && (a - b) < 0)) {
			System.out.println("中間値は" + b + "です。");
		} else if (((a - c) < 0 && (b - c) > 0) || ((a - c) > 0 && (b - c) < 0)) {
			System.out.println("中間値は" + c + "です。");
		} else if (a == b &&  a == c) {
			System.out.println("全て同じ数字です。");
		} else {
		   System.out.println("中間値が存在しません。");
		}
	}
}
