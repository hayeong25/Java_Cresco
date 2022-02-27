package ch04.ex02;

class SavingsAccount extends Account {
	static final double rate = 0.005;
	
	public SavingsAccount(String number, String name, long amount) {
		super(number, name, amount);
	}
	
	int calculateInterestAmount(int term) {
		return (int)(getAmount() * rate * term);
	}
	
	void addInterestAmount() {
		long amount;
		amount = getAmount() + this.calculateInterestAmount(1);
		setAmount(amount);
	}
}