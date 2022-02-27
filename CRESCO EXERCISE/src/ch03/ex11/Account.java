package ch03.ex11;

class Account {
	private long amount;
	private int term;
	private static final double rate = 0.002;
	private long interest;
	
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	public void setTerm(int term) {
		this.term = term;
	}
	
	public static double getRate() {
		return rate;
	}
	
	public long getInterest() {
		interest = (long)(amount * rate * term);
		return interest;
	}
}