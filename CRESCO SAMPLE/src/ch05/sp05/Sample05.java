package ch05.sp05;

public class Sample05 {
	public static void main(String[] args) {
		Book book = new Book();
		book.printFieldValue("currentPage");
		book.read();
		book.printFieldValue("currentPage");
		book.read();
		book.printFieldValue("currentPage");
	}
}
