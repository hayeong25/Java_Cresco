package ch02.ex16;

public class Ex16 {
	enum Al {
		K, J, H, L
	}

	public static void main(String[] args) {
		Al al = Al.J;

		switch (al) {
		case H:
			System.out.println("左です");
			break;

		case J:
			System.out.println("下です");
			break;

		case K:
			System.out.println("上です");
			break;

		case L:
			System.out.println("右です");
			break;

		default:
			System.out.println("該当するものがありません");
		}
	}
}