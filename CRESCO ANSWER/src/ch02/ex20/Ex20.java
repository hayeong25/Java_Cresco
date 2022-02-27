package ch02.ex20;

public class Ex20 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		double x = 0;

		// a = 0 は代入を表し、評価結果は 0 となる。
		// if の () の中は、評価結果が false か true になる
		// 条件式等でなければならない。
		// 評価結果が boolean となる == の関係演算子を使用する必要がある。
		if(a == 0){
			System.out.println("解なし");
		}else{
			x = (double) b / a;
			System.out.println("解" + x);
		}
	}
}
