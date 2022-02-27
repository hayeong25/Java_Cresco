package ch11.sp01;

public class ThreadB extends Thread {
	@Override
	public void run(){
		for(int i = 0; i < 100; i++) {
			System.out.println("B");
		}
	}
}
