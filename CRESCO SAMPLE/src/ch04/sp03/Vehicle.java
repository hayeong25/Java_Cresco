package ch04.sp03;

abstract class Vehicle {
	protected int boardNum = 0; // 現乗車人数

	public abstract void run(); // 走る

	public abstract void stop(); // 止まる
	
	public void ride(int num){  // 乗る
		boardNum += num;
	}
}