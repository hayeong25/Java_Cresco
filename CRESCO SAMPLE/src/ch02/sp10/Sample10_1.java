package ch02.sp10;

public class Sample10_1 {
	public static void main(String[] args) {
		int base = 16;
		int n = 0;
		System.out.println("1から100までの数字における" + base + "の倍数を3つ表示（大きい順）");

		for(int i=100; i>=1; i--){
			if( i % base == 0 ){
				n++;
				System.out.println(i);
				if( n == 3){
					break;
				}
			}
		}
	}
}
