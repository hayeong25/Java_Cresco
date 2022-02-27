package ch03.sp06;

public class Sample06 {
	public static void main(String[] args) {
		Food f1 = new Food("ラムネ", 60);
		f1.showFood();
		System.out.println("---");
		Order o = new Order(f1);
		o.additionalOrder();
		System.out.println("--食品変更--");
		Food f2 = new Food("せんべい", 200);
		o.changeFood(f2);
		System.out.println("---");
		Food f3 = o.getFood();
		f3.showFood();
	}
}
