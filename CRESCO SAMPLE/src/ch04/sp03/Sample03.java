package ch04.sp03;

public class Sample03 {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Vehicle v2 = new Train();
		
		doAction(v1);
		doAction(v2);
	}
	
	public static void doAction(Vehicle v){
		v.run();
		v.stop();
	}
}