package ch03.ex04;

public class Ex041 {
	public static void main(String[] args) {
		Pot pot = new Pot();
		
		pot.amount = 50;
		
		while(pot.temperature < 20) {
			pot.heat();
		}
		
		int n = pot.pour() * 3;
		
		pot.show();
		System.out.println("使用した水量 : " + n + "リットル");
	}
}