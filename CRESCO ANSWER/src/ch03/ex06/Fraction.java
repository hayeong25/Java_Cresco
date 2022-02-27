package ch03.ex06;

public class Fraction {
	private int numerator; // 分子

	private int denominator; // 分母

	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}

	public Fraction multiply(Fraction f) {

		int retDenominator = denominator * f.denominator;
		int retNumerator = numerator * f.numerator;
		Fraction ret = new Fraction(retNumerator, retDenominator);
		return ret;
	}

	public int getDenominator() {
		return denominator;
	}

	public int getNumerator() {
		return numerator;
	}
}
