package ch02.ex08;

public class Ex08 {
	public static void main(String[] args) {
		for (int i = 1900; i <= 2020; i++) {
			if (( (i % 4 == 0) && (i % 100 != 0) ) || (i % 400 == 0) ) {
				System.out.println(i + "年はうるう年です。");
			}
		}
	}
}
