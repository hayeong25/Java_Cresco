package ch07.ex04.linerect;

public class Rectangle {
	private int height;
	private int width;
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public void showRectangle() {
		for (int i=1; i<=height; i++) {
			for (int j=1; j<=width; j++) {
				if ((i==1) || (i==height)) {
					System.out.print("*");     
				} else if ((j==1) || (j==width)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}