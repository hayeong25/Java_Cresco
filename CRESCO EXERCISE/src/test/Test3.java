package test;

/*
* [設問3]
* 0から指定された整数値(max)になるまで、1ずつカウントアップし表示する。
*
* ◆出力例（与えられた数値が5の場合）◆
* 0
* 1
* 2
* 3
* 4
* 5
*/

public class Test3 {
	public static void main(String[] args) {
		int max = 5;
		
		for(int i = 0; i <= max; i++) {
			System.out.println(i);
		}
	}
}