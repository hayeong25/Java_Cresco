package ch03.ex10;

public class Graphic {
	private int length;
	private String mark;

	public Graphic() {
		this("@", 3);
	}

	public Graphic(int length) {
		this("@", length);
	}

	public Graphic(String mark, int length) {
		this.mark = mark;
		this.length = length;
	}

	public void print() {
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}
	}
}