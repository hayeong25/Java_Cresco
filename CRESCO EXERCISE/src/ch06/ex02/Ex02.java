package ch06.ex02;

public class Ex02 {
	public static void main(String[] args) {
		int orderNumber = 20;
		Goods goods = new Goods();
		boolean isOrder = goods.doOrder(orderNumber);
		if (isOrder) {
			System.out.println("注文を受け付けました。");
		} else {
			System.out.println("注文数が在庫数を超えています。注文できません。");
		}
	}
}