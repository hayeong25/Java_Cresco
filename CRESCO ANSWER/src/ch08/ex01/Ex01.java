package ch08.ex01;

public class Ex01 {
	public static void main(String[] args) {
		String eclipse = "eclipse";
		System.out.println("2文字目から5文字目まで表示します。");
		String temp = eclipse.substring(1, 5);
		System.out.println(temp);
		System.out.println("'c'が最初に現れる位置のインデックスの値を表示します。");
		int index = eclipse.indexOf("c");
		System.out.println(index);
	}
}
