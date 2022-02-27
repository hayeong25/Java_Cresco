package ch03.ex15;

public class Ex15 {

	public static void main(String[] args) {
		Name name = new Name(); // オブジェク オブジェク名 ＝ new クラス名();
		name.setFamilyName("山田");
		name.setFirstName("太郎");
		System.out.println(name.getFullName());
	}
}
