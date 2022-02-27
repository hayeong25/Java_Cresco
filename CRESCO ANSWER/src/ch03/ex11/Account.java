package ch03.ex11;

public class Account {
	private static double rate = 0.002;

	private long amount;

	private int term;

	public Account() {
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public static double getRate() {
		return rate;
	}

	public long getInterest() {
		// 1円未満を切り捨てるためにlong型にキャストして表示
		return (long) (amount * rate * term);
	}
}
