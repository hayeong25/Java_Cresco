package ch02.ex04;

public class Ex04 {

	public static void main(String[] args) {
		char c = 'K';
		switch (c) {
		case 'H':
			System.out.println("左です");
			break;

		case 'J':
			System.out.println("下です");
			break;

		case 'K':
			System.out.println("上です");
			break;

		case 'L':
			System.out.println("右です");
			break;

		default:
			System.out.println("該当するものがありません");
		}

	}

}
