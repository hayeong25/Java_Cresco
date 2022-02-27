package ch11.ex02;

public class Ex02 {
	public static void main(String[] args) {
		CountUpThread thread1 = new CountUpThread();
		CountDownThread thread2 = new CountDownThread();
		
		thread1.start();
		thread2.start();
	}
}
