package ch02.ex06;

public class Ex06 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("forループを使って求めた1～100の合計値");
		System.out.println(sum);

		sum = 0;
		int count = 1;
		while (count <= 100) {
			sum = sum + count;
			count++;
		}
		System.out.println("whileループを使って求めた1～100の合計値");
		System.out.println(sum);

		sum = 0;
		count = 1;
		do {
			sum = sum + count;
			count++;
		} while (count <= 100);
		System.out.println("do～whileループを使って求めた1～100の合計値");
		System.out.println(sum);
	}
}
