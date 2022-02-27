package ch04.ex01;

public class Ex01 {
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.setNumber("1234567");
		savingsAccount.setAmount(10000);
		savingsAccount.setRate(0.02);
		int term = 2;

		System.out.print("口座番号" + savingsAccount.getNumber() + "の");
		System.out.print(term + "年後の利息は");
		System.out.println(savingsAccount.calculateInterestAmount(term) + "円です。");
	}
}
