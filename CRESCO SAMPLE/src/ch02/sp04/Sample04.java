package ch02.sp04;

public class Sample04 {
	public static void main(String[] args) {
		int v1 = 150;
		boolean test1 = (0 <= v1) || (v1 <=100);
		System.out.println("test1:" + test1);
		
		int v2 = 9;
		int test2 = ((v2 % 2) == 0) ? (v2 * 2) : (v2 / 2);
		System.out.println("test2:" + test2);
		
		int v3 = 0b11111001;
		int test3 = v3 ^ 0b11111111 | 0b00000001;
		System.out.println("test3:" + test3);
	}
}
