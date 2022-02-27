package ch02.ex02;

public class Ex02 {
	public static void main(String[] args) {
		int score = 70;
		if (80 <= score && score <= 100) {
			System.out.println("大変よくできました。");
		} else if (60 <= score && score < 80) {
			System.out.println("よくできました。");
		} else if (0 <= score && score < 60) {
			System.out.println("もう少しがんばりましょう。");
		}
	}
}
