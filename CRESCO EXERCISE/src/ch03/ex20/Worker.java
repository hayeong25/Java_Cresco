package ch03.ex20;

class Worker {
	private static int money = 0;
	private int salary;
	
	public Worker(int salary) {
		this.salary = salary;
	}
	
	public void work() {
		money = money + salary;
	}
	
	public void play() {
		money = money - salary;
	}
	
	public static int getMoney() {
		return money;
	}
}