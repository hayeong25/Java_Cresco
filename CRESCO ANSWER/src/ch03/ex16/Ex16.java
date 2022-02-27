package ch03.ex16;

public class Ex16 {

	public static void main(String[] args) {
		Rectangle aRectangle;
		
		// コンストラクタの呼出しの引数の数が、
		// コンストラクタの定義と一致していないのがエラーの原因。
		// コンストラクタの定義に合わせて値を渡す必要がある。
		aRectangle = new Rectangle(2, 3, 4, 5);
		aRectangle.draw();

	}

}
