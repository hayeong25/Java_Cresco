package ch05.sp05;

public class Book implements PrintFieldValue {
	private int currentPage = 0;

	void read() {
		currentPage += 10;
	}
}
