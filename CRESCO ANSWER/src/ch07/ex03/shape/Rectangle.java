package ch07.ex03.shape;

public class Rectangle {
	public void showRectangle() {
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
