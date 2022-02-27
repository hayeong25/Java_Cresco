package ch03.ex07;

public class Fraction {
	private int numerator; // 分子

	private int denominator; // 分母

	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}

	public Fraction add(Fraction f) {

		int retNumerator = (numerator * f.denominator)
				+ (denominator * f.numerator);
		int retDenominator = f.denominator * denominator;

		for (int i = retDenominator; i > 1; i--) {
			if (retDenominator % i == 0 && retNumerator % i == 0) {
				retDenominator = retDenominator / i;
				retNumerator = retNumerator / i;
			}
		}
		return new Fraction(retNumerator, retDenominator);
	}

	public int getDenominator() {
		return denominator;
	}

	public int getNumerator() {
		return numerator;
	}
}
