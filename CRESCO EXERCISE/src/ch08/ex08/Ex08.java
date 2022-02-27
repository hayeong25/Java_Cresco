package ch08.ex08;

public class Ex08 {

	public static void main(String[] args) {
		String password = new String("yamada");
		String retyped = "";
		
		if(password == retyped){
			System.out.println("パスワードと再入力したパスワードが一致");
		}else{
			System.out.println("パスワードと再入力したパスワードが不一致");
		}
		
		retyped = new String("yamada");
		
		if(password == retyped){
			System.out.println("パスワードと再入力したパスワードが一致");
		}else{
			System.out.println("パスワードと再入力したパスワードが不一致");
		}
	}
}
