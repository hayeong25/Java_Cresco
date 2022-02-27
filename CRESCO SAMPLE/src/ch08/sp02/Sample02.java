package ch08.sp02;

public class Sample02 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("UML%Java%Modeling");
		System.out.println(sb);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '%') {
				sb.setCharAt(i, '/');
			}
		}
		System.out.println(sb);
	}
}
