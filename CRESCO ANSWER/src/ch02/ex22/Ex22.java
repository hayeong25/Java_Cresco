package ch02.ex22;

public class Ex22 {

	public static void main(String[] args) {
		int in = 2;
		
		// swtich case 文は、どこかの case で合致すると、
		// 以降のcase文に記述されている命令がすべて実行される仕様になっている。
		// caseごとで処理を終了させるにはbreak文が必要となる。
		switch(in){
		case 2:
			System.out.println("下");
			break;
		case 4:
			System.out.println("左");
			break;
		case 6:
			System.out.println("右");
			break;
		case 8:
			System.out.println("上");
			break;
		default:
			System.out.println("無効な入力");
		}

	}

}
