package ch03.ex17;

class Accumulator {
	private double dValue = 0.0;
	private int iValue = 0;
	
	public void addValue(int value) {
		iValue = iValue = value;
	}
	
	public void addValue(double value) {
		dValue = dValue + value;
	}
	
	public double getTotalValue() {
		return dValue + iValue;
	}
}