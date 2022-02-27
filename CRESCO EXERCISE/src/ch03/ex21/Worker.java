package ch03.ex21;

public class Worker {
	private static int money = 0;
	private int salary; // インスタンスフィールドにアクセスするにはインスタンスメソッドにする
	public Worker(int salary) {
		this.salary = salary;
	}
	public void work(){
		money = money + salary;
	}
	public void play(){
		money = money - salary;
	}
	public static int getMoney(){
		return money;
	}
	public void baseUp(int value){ // クラスメソッドからインスタンスフィールドにアクセスできない。
		salary = salary + value;
	}
}