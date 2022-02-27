package ch04.ex05;

public class Rectangle {
	private int width; // 横の長さ
	private int height; // 縦の長さ

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return "縦の長さは" + height + "で、横の長さは" + width + "の長方形です。";
	}
}