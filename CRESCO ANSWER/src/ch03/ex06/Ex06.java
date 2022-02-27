package ch03.ex06;

public class Ex06 {
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 5);
		Fraction f2 = new Fraction(2, 3);
		Fraction f3 = f1.multiply(f2);

		System.out.print(f1.getNumerator() + "/" + f1.getDenominator() + "×");

		System.out.println(f2.getNumerator() + "/" + f2.getDenominator() + "は");

		System.out.println(f3.getNumerator() + "/" + f3.getDenominator() + "です。");
	}
}
