package ch06.sp03;

public class Account {
	private int balance; // 預金残高

	public Account(int amount) { // 引数は初回入金額
		balance = amount;
	}

	public void withdraw(int amount) throws BalanceShortageException {
		if (balance < amount) {
			int diff = amount - balance;
			throw new BalanceShortageException("不足額:" + diff);
		}
		balance = balance - amount;
	}
}
