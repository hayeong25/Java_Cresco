package ch11.ex02;

class CountUpThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
	}	
}