package ch04.ex02;

public class Ex02 {
	public static void main(String[] args) {

		SavingsAccount account = new SavingsAccount("08081919", "きのした　すぐる",
				1000000);

		System.out.println("口座番号 " + account.getNumber() + " の名義 "
				+ account.getName() + " 様の預金額は " + account.getAmount() + " 円です。");

		//利息を追加
		account.addInterestAmount();
		System.out.println("1年後の利息分を追加");

		System.out.println("口座番号 " + account.getNumber() + " の名義 "
				+ account.getName() + " 様の預金額は " + account.getAmount() + " 円です。");
		
	}
}
