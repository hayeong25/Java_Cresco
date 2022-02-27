package ch03.sp06;

public class Food {
	private String name;
	private int price;
	public Food(String name, int price){
		this.name = name;
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void updatePrice(int price){
		this.price = price;
	}
	public void showFood(){
		System.out.println("名前：" + name + ", 単価：" + price);
	}
}
