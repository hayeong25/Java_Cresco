package ch03.ex08;

public class Ex08 {
	public static void main(String[] args) {
		int[] intValues = { 10, 5, 0 };
		double[] doubleValues = { 1.15, 2.22, 2.34 };

		Score score = new Score();

		System.out.println("int型配列の平均値は");
		System.out.println(score.average(intValues));

		System.out.println("double型配列の平均値は");
		System.out.println(score.average(doubleValues));
	}
}
