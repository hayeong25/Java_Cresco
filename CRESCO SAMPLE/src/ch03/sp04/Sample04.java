package ch03.sp04;

public class Sample04 {
	public static void main(String[] args) {
		Score c = new Score();
		double avg;

		avg = c.average(10, 20);
		System.out.println("平均値：" + avg);

		avg = c.average(10, 20, 30);
		System.out.println("平均値：" + avg);

		avg = c.average(20.0, 10.0);
		System.out.println("平均値：" + avg);
	}
}
