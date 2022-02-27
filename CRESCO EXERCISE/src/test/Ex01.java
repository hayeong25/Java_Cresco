package test;

public class Ex01 {
	public static void main(String[] args) {
		int[] number = new int[10];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
		
		for(int i = 0; i < number.length; i++) {
			if(number[i] % 2 == 0) {
				System.out.println("2の倍数");
			}
			else {
				System.out.println(number[i]);
			}
		}
	}
}