package ch04.ex02;

public class Account {
	private String name;
	private String number;
	private long amount;

	public Account(String number, String name, long amount) {
		this.number = number;
		this.name = name;
		this.amount = amount;
	}

	public long getAmount() {
		return amount;
	}

	protected void setAmount(long amount){
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}
}