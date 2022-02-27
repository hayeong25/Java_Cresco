package ch07.ex02.shape;

public class Rectangle {
	public void showFillRectangle() {
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
