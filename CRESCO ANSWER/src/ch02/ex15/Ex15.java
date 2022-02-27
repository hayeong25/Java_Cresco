package ch02.ex15;

public class Ex15 {
	public static void main(String[] args) {
		int[] numbers = { 170, 165, 180, 145, 175 };

		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("最大値は" + max + "です。");
	}
}