package ch03.ex08;

class Score {
	public double average(int[] values) {
		double sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}
		return sum / values.length; 
	}
	
	public double average(double[] values) {
		double sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}
		return sum / values.length; 
	}
}