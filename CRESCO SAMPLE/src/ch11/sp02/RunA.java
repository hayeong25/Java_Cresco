package ch11.sp02;

public class RunA implements Runnable {
 	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("A");
		}
	}
}
