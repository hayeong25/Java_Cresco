package ch02.ex11;

public class Ex11 {
	public static void main(String[] args) {
		int endNumber = 50; // 自然数を与える

		// 素数かどうかの真偽値
		System.out.println(endNumber + "以下の素数を表示します。");
		boolean isPrime = false;

		// 2から与えられた自然数を対象に素数を探す
		for (int i = 2; i <= endNumber; i++) {
			isPrime = true;
			int limit = i / 2 + 1;
			for (int j = 2; j < limit; j++) {
				if (0 == (i % j)) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				System.out.print(i + " ");
			}
		}
	}
}
