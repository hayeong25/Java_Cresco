package ch02.ex07;

public class Ex07 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}
}