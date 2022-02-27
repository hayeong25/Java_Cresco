package ch04.ex02;

public class SavingsAccount extends Account {
	
	private static final double RATE =0.005;

	public SavingsAccount(String number, String name, long amount) {
		super(number, name, amount);
	}

	private long calculateInterestAmount() {
		return (long) (getAmount() * RATE);
	}

	public void addInterestAmount() {
		long amount = getAmount() + this.calculateInterestAmount();
		// long amount = (long)(getAmount()*(1+RATE));
		// 上記でも数学的には以下の計算でも同一の結果となるが、
		// プログラムでは小数値を正確に表現できないことがあるため（無限小数）、丸め誤差が発生してしまう。
		// 小数値を用いて正しく計算する場合は、整数値で値を表現するか、BigDecimalクラスを利用するかする必要がある。
		// 詳細は Joshua Bloch著 『Effective Java 第2版』（ピアソン桐原,2008年） の
		// 項目48「正確な答えが必要ならば、floatとdoubleを避ける」を参照 
		this.setAmount(amount);
	}
}