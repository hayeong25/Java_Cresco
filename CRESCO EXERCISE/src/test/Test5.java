package test;

/*
* [設問5]
* a=10,b=20の時、aとbの値を入れ替えて表示する
*
* ◆出力例◆
* a:10 b:20
* スワップ後
* a:20 b:10
*
*/

public class Test5 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		
		System.out.print("a:");
		System.out.print(a);
		System.out.print(" b:");
		System.out.println(b);

		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("スワップ後");
		System.out.print("a:");
		System.out.print(a);
		System.out.print(" b:");
		System.out.print(b);
	}
}