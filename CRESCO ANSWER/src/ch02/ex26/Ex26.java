package ch02.ex26;

public class Ex26 {

	public static void main(String[] args) {
		// 配列の変数定義と配列の初期化を分けて行うことはできない。
		// { } を用いた初期化は変数定義時に行わなければならない。 
		int[] array = { 1, 2, 3, 4, 5 };
		
		// 配列に代入された値を出力する
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
