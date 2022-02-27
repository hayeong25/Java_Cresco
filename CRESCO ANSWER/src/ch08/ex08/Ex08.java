package ch08.ex08;

public class Ex08 {

	public static void main(String[] args) {
		String password = new String("yamada");
		String retyped = "";
		
		// 文字列が同一かどうかを比較する場合は、
		// 値が同じかどうかを確認するequalsメソッドを用いる必要がある。
		// == 関係演算子はアドレスの比較を行うので、値が同じでも
		// 指しているアドレスが違えばfalseとなる。
		if(password.equals(retyped)){
			System.out.println("パスワードと再入力したパスワードが一致");
		}else{
			System.out.println("パスワードと再入力したパスワードが不一致");
		}
		
		retyped = new String("yamada");

		// 同上
		if(password.equals(retyped)){
			System.out.println("パスワードと再入力したパスワードが一致");
		}else{
			System.out.println("パスワードと再入力したパスワードが不一致");
		}
	}
}