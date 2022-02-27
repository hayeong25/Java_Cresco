package ch06.sp04;

public class Sample04 {
	public static void main(String[] args) {
		ScoreBook book = new ScoreBook();
		book.addScore(50);
		book.addScore(120); //IllegalArgumentException例外が発生  
		book.getScore(-1); //IndexOutOfBoundsException例外が発生
		book.average();  //UnsupportedOperationException例外が発生
	}
}