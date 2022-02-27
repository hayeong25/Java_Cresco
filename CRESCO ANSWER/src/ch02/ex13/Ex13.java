package ch02.ex13;

public class Ex13 {
	public static void main(String[] args) {
		String[] shain = new String[4];

		shain[0] = "スミスさん";
		shain[1] = "クロマティーさん";
		shain[2] = "バースさん";
		shain[3] = "ポンセさん";

		for (int i = 0; i < shain.length; i++) {
			System.out.println(shain[i]);
		}
		System.out.println("------------------------");

		String tmp;

		tmp = shain[0];
		shain[0] = shain[1];
		shain[1] = tmp;

		for (int i = 0; i < shain.length; i++) {
			System.out.println(shain[i]);
		}
	}
}
