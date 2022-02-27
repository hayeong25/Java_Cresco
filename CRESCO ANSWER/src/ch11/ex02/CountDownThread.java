package ch11.ex02;

class CountDownThread implements Runnable {
	@Override
	public void run() {
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
	}	
}
