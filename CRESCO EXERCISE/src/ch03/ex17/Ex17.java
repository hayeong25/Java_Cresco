package ch03.ex17;

public class Ex17 {
	public static void main(String[] args) {
		Accumulator aAccumulator = new Accumulator();
		
		aAccumulator.addValue(2.2);
		aAccumulator.addValue(3);
		aAccumulator.addValue(4.4);
		aAccumulator.addValue(5);
		aAccumulator.addValue(6.6);
		aAccumulator.addValue(7);
		aAccumulator.addValue(8.8);
		
		System.out.println(aAccumulator.getTotalValue());
	}
}

// 実行結果 : 29.0