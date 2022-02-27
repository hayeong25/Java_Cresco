package ch02.ex11;

public class Ex11 {
	public static void main(String[] args) {
		int n;
		int count = 0;
		for(n = 2; n < 100; n++) {
			for(int i = 1; i <= n; i++) {
				if(n % i == 0) {
					count++;
				}
			}
			
			if(count == 2) {
				System.out.print(n + " ");
				count = 0;
			}
		}
	}
}