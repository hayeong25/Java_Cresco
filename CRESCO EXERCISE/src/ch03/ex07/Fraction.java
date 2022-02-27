package ch03.ex07;

class Fraction {
	int numerator;
	int denominator;
	
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	public Fraction(int numerator, int denominator) {
		numerator = this.numerator;
		denominator = this.denominator;
	}
	
	Fraction add(Fraction fraction) {
		int addnumerator = (numerator * fraction.denominator) + (denominator * fraction.numerator);
		int adddenominator = denominator * fraction.denominator;
		
		for(int i = adddenominator; i > 1; i--) {
			if((addnumerator % i == 0) && (adddenominator % i == 0)) {
				addnumerator = addnumerator / i;
				adddenominator = adddenominator / i;
			}
		}
		Fraction f = new Fraction(addnumerator, adddenominator);
		return f;
	}
}