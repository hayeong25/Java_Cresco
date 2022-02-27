package ch04.ex01;

public class Ex01 {
	public static void main(String[] args) {
		SavingsAccount savingsaccount = new SavingsAccount();
		
		savingsaccount.setNumber("1234567");
		savingsaccount.setAmount(10000);
		savingsaccount.setRate(0.02);
		int term = 2;
		
		System.out.print("口座番号" + savingsaccount.getNumber() + "の"
				+ term + "年後の利息は"
				+ savingsaccount.calculateInterestAmount(term) + "円です。");
	}
}