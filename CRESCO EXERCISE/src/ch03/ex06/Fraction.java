package ch03.ex06;

class Fraction {
	int numerator;
	int denominator;
	
	int getNumerator() {
		return numerator;
	}

	int getDenominator() {
		return denominator;
	}

	public Fraction(int numerator, int denominator) {
		numerator = this.numerator;
		denominator = this.denominator;
	}
	
	Fraction multiply(Fraction fraction) {
		int mulnumerator = numerator * fraction.numerator;
		int muldenominator = denominator * fraction.denominator;
		Fraction f = new Fraction(mulnumerator, muldenominator);
		return f;
	}
}