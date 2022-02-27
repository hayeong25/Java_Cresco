package ch04.ex02;

public class Ex02 {
	public static void main(String[] args) {
		SavingsAccount savingsaccount = new SavingsAccount("08081919", "きのした すぐる",1000000);
		
		System.out.print("口座番号" + savingsaccount.getNumber() + "の名義 ");
		System.out.println(savingsaccount.getName() + "様の預金額は"
				+ savingsaccount.getAmount() + "円です。");
		
		System.out.println("１年後の利息分を追加");
		savingsaccount.addInterestAmount();
		System.out.print("口座番号" + savingsaccount.getNumber() + "の名義 ");
		System.out.println(savingsaccount.getName() + "様の預金額は"
				+ savingsaccount.getAmount() + "円です。");
	}
}