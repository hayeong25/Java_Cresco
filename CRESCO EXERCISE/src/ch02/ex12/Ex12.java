package ch02.ex12;

public class Ex12 {
	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		while(true) {
			sum = sum + i;
			
			if(sum >= 10000) {
				break;
			}
			
			i++;
		}
		
		System.out.println("1から" + i + "まで足すと10000以上になります。");
		System.out.println("その時の合計値は" + sum + "です。");
	}
}