package ch06.ex03;

public class Ex03 {
	public static void main(String[] args) {
		int orderNumber = 20;
		Goods goods = new Goods();
		
		try {
			goods.doOrder(orderNumber);
			System.out.println("注文を受け付けました。");
		} catch (StockShortageException e) {
			System.out.println(e.getMessage());
			System.out.println("注文数が在庫数を超えています。注文できません。");
		}
	}
}