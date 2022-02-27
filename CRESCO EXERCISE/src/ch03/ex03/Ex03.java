package ch03.ex03;

public class Ex03 {
	public static void main(String[] args) {
		Pot pot = new Pot();
		
		pot.amount = 50;
		
		while(pot.temperature < 40.0) {
			pot.heat();
		}
		
		int n = pot.pour() + pot.pour();
		
		pot.show();
		System.out.println("使用した水量 : " + n + "リットル");
	}
}