package ch03.sp06;

public class Order {
	private int amount = 1; // 数量 
	private Food food;
	
	public Order(Food food){
		this.food = food;
	}

	public void additionalOrder(){
		amount++;
		this.showTotalPrice();
	}

	private void showTotalPrice() {
		System.out.println("数量:" + amount);
		System.out.println("合計金額:" + amount * food.getPrice());
	}
	
	public void changeFood(Food food) {
		this.food = food;
		amount = 1; // 数量を初期化
		this.food.showFood();
		this.showTotalPrice();
	}

	public Food getFood() {
		return food;
	}
}
