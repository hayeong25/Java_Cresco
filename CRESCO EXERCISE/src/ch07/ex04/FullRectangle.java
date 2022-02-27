package ch07.ex04;

public class FullRectangle {
	private int height;
	private int width;
	public FullRectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public void showRectangle() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
