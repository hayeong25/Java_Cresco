package ch02.ex20;

public class Ex20 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		double x = 0;
		
		if(a == 0){ // =ではなく＝＝
			System.out.println("解なし");
		}
		else{
			x = (double) b / a;
			System.out.println("解" + x);
		}
	}
}