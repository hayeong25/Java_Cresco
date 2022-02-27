package ch11.ex02;

public class Ex02 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new CountDownThread());
		Thread thread2 = new Thread(new CountUpThread());
		
		thread1.start();
		thread2.start();
	}
}

