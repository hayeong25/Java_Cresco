package ch04.sp03;

public class Car extends Vehicle {
	@Override
	public void run() {
		System.out.println("車が走りだした");
	}

	@Override
	public void stop() {
		System.out.println("車が止まった");
	}
	
	public void beep() {
		System.out.println("車が音を鳴らした");
	}
}
