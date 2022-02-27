package ch03.ex21;

public class Worker {
	private static int money = 0;
	private int salary;
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
	// クラスメソッドからインスタンスフィールドにアクセスすることはできない。
	// インスタンスフィールドにアクセスするにはインスタンスメソッドにする必要がある。
	public void baseUp(int value){
		salary = salary + value;
	}
}
