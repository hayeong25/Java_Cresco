package ch02.ex17;

public class Ex17 {

	public static void main(String[] args) {
		double dValue = 12.3;
		// 45.6 は double のリテラルとして解釈される。
		// float のリテラルを表現するためには末尾にfが必要。
		float fValue = 45.6f;
		int iValue = 50;
		long lValue = 100;

		// 2つの変数において型が異なる場合、より大きい値を格納できる型の変数を
		// その型より小さい値しか格納できない型の変数に代入する場合は、
		// 明示的にキャストを行う必要がある。
		// 代入先の変数の型で扱える範囲を超えるような値を代入しようとした場合、
		// 桁あふれが起こるので事前に値がその範囲に収まるかどうかのチェック
		// をすることが望ましい。
		iValue = (int)dValue;
		fValue = (float)dValue;
		iValue = (int)lValue;
	}
}
