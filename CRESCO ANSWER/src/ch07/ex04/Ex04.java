package ch07.ex04;

public class Ex04 {
	public static void main(String[] args) {
		ch07.ex04.fillrect.Rectangle fillRect = new ch07.ex04.fillrect.Rectangle(
				5, 5);
		ch07.ex04.linerect.Rectangle lineRect = new ch07.ex04.linerect.Rectangle(
				5, 5);
		fillRect.showRectangle();

		System.out.println("-----------");
		lineRect.showRectangle();
	}
}
