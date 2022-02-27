package ch02.ex06;

public class Ex06 {
	public static void main(String[] args) {
		
		System.out.println("forループを使って求めた１～１００の合計値");
		int sum1 = 0;
		for(int i1 = 1; i1 <= 100; i1++) {
			sum1 = sum1 + i1;			
		}
		System.out.println(sum1);
		
		System.out.println("whileループを使って求めた１～１００の合計値");
		int sum2 = 0;
		int i2 = 1;
		while(i2 <= 100) {
			sum2 = sum2 + i2;
			i2++;
		}
		System.out.println(sum2);
		
		System.out.println("do~whileループを使って求めた１～１００の合計値");
		int sum3 = 0;
		int i3 = 1;
		do {
			sum3 = sum3 + i3;
			i3++;
		} while(i3 <= 100);
		System.out.println(sum3);
	}
}