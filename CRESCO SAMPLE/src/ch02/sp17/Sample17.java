package ch02.sp17;

public class Sample17 {

	public static void main(String[] args) {
		Suit kind = Suit.HEARTS;

		switch (kind) {
		case GLUBS:
			System.out.println("クラブです");
			break;

		case DIAMONDS:
			System.out.println("ダイアです");
			break;

		case HEARTS:
			System.out.println("ハートです");
			break;

		case SPADES:
			System.out.println("スペードです");
			break;
		}
	}
}
