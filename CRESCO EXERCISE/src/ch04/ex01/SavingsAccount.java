package ch04.ex01;

public class SavingsAccount extends Account {
	double rate;
	
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	int calculateInterestAmount(int term) {
		return (int)(getAmount() * rate * term);
	}
}