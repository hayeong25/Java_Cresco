package ch02.ex25;

public class Ex25 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		
		// 配列に代入された値を出力する forの終了条件が
		// i<=array.length となっているため、
		// 配列のサイズを超えてアクセスしてしまっている。
		// <= ではなく、< とする必要がある。
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}