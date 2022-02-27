package ch03.ex15;

public class Ex15 {

	public static void main(String[] args) {
		// ローカル変数は初期化しないとコンパイルエラーとなる。
		Name name = new Name();
		name.setFamilyName("山田");
		name.setFirstName("太郎");
		System.out.println(name.getFullName());
	}

}
