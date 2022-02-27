package ch04.sp04;

public class Train extends Vehicle {
	@Override
	public void run() {
		System.out.println("電車が発車しだした");
	}

	@Override
	public void stop() {
		System.out.println("電車が止まった");
	}
	
	public void announce() {
		System.out.println("電車が駅に到着した");
	}
}
