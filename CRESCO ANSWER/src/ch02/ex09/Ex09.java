package ch02.ex09;

public class Ex09 {
	public static void main(String[] args) {
		int width = 5;
		int height = 5;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
