package ch11.sp03;

public class Sample03 {
	public static void main(String[] args) {
		Product product = new Product(20); // 在庫20個
		OrderThread aThread = new OrderThread(product, 3);
		OrderThread bThread = new OrderThread(product, 5);
		aThread.start();  // Aスレッドの開始
		bThread.start();  // Bスレッドの開始
	}
}
