package ch03.ex11;

public class Ex11 {
	public static void main(String[] args) {
		Account a = new Account();
		a.setAmount(1000000L);
		a.setTerm(2);

		Account b = new Account();
		b.setAmount(800000L);
		b.setTerm(15);

		System.out.println("利率は" + Account.getRate() + "です。");
		System.out.println("Aさんの利息は" + a.getInterest() + "円です。");
		System.out.println("Bさんの利息は" + b.getInterest() + "円です。");
	}
}
