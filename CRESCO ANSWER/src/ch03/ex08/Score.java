package ch03.ex08;

public class Score {
	public double average(int[] values) {
		double ret = 0;
		for (int i = 0; i < values.length; i++) {
			ret = ret + values[i];
		}
		return ret / values.length;
	}

	public double average(double[] values) {
		double ret = 0;
		for (int i = 0; i < values.length; i++) {
			ret = ret + values[i];
		}
		return ret / values.length;
	}
}
