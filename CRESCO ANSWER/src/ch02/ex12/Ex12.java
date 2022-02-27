package ch02.ex12;

public class Ex12 {
	public static void main(String[] args) {
		int goal = 10000;
		int sum = 0;
		int i = 0;
		while (true) {
			i++;
			sum = sum + i;
			if (sum >= goal) {
				break;
			}
		}
		System.out.println(1 + "から" + i + "までを足すと" + goal + "以上になります。");
		System.out.println("その時の合計値は" + sum + "です。");
	}
}
