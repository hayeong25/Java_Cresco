package ch03.ex07;

public class Ex07 {
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 10);
		Fraction f2 = new Fraction(7, 30);

		Fraction f3 = f1.add(f2);

		System.out.print(f1.getNumerator() + "/" + f1.getDenominator() + "+");

		System.out.println(f2.getNumerator() + "/" + f2.getDenominator() + "は");

		System.out.println(f3.getNumerator() + "/" + f3.getDenominator() + "です。");
	}
}
