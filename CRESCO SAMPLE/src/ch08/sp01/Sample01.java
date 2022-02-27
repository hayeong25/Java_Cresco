package ch08.sp01;

public class Sample01 {
	public static void main(String[] args) {
		String str = "Java";
		String str2 = new String("Java");
		String str3 = new String("JAVA");
		System.out.println("strとstr2の文字列は等しいか？ " + str.equals(str2));
		System.out.println("strとstr3の文字列は等しいか？ " + str.equals(str3));
	}
}
