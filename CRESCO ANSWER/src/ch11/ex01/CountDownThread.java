package ch11.ex01;

class CountDownThread extends Thread {
	@Override
	public void run() {
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
	}	
}