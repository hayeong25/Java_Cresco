package test;

/*
* [設問6]
* 渡された引数の絶対値を返すメソッドを実装し、そのメソッドを呼び出した結果を表示する
*
* ◆出力例
* 100の絶対値：100
* 0の絶対値：0
* -40の絶対値：40
*
*/

public class Test6{
	public static void main(String[] args){
		int data1 = 100;
		int data2 = 0;
		int data3 = -40;
		
		System.out.println(data1 + "の絶対値：" + abs(data1));
		System.out.println(data2 + "の絶対値：" + abs(data2));
		System.out.println(data3 + "の絶対値：" + abs(data3));
	}

	static int abs(int number){
		if(number < 0) {
			number = -1 * number;
		}
		return number;
	}
}