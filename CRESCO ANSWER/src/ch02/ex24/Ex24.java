package ch02.ex24;

public class Ex24 {

	public static void main(String[] args) {
		// 配列の領域を new で確保しないと、値を代入できない。
		int[] array = new int[5];

		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		// 配列に代入された値を出力する
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
