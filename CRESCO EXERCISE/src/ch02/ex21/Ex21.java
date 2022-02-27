package ch02.ex21;

public class Ex21 {
	public static void main(String[] args) {
		int x1 = 4;
		int x2 = 7;
		int absDiff = 0;
		
		if(x1 < x2) {
			absDiff = x2 - x1;
			System.out.println(x1 + "は" + x2 + "より小さい値です");
		}
		else if(x1 > x2) {
			absDiff = x1 - x2;
			System.out.println(x1 + "は" + x2 + "より大きい値です");
		}
		else {
			System.out.println(x1 + "と" + x2 + "は等しい値です");
		}
		
		System.out.println(x1 + "と" + x2 + "の差の絶対値は" + absDiff);
	}
}