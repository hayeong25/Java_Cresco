package ch02.sp05;

public class Sample05 {
	public static void main(String[] args) {
		int stock = -5; 

		if(stock < 0)
			System.out.println("異常です。");
			System.out.println("在庫:" + stock);
		if(stock > 0)
			System.out.println("在庫:" + stock);
		else
			System.out.println("補充してください。");
			System.out.println("在庫:" + stock);
	}
}
