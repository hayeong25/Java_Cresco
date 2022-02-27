package ch06.ex04;

public class Ex04 {
	public static void main(String[] args) {
		String str = "D1001";
		CodeScheme cs = new CodeScheme();
		try {
			cs.checkFormat(str);
			System.out.println("規定された文字列です。");
		} catch (IllegalFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
