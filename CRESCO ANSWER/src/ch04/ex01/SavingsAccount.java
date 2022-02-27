package ch04.ex01;

public class SavingsAccount extends Account {
	private double rate;

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public long calculateInterestAmount(int term) {
		return (long) (getAmount() * rate * term);
	}
}
