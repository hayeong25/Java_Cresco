package ch03.ex10;

public class Graphic {
	int length;
	String mark;

	public Graphic() {
		mark = "@";
		length = 3;
	}
	
	public Graphic(int length) {
		mark = "@";
		this.length = length;
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
			System.out.println("");
		}
	}
}