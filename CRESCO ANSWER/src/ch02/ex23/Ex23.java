package ch02.ex23;

public class Ex23 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		
		// 配列に代入された値を出力する
		// 配列の添え字は 1 始まりではなく、0 始まりである。
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
