package ch06.ex02;

public class Goods {
	private int stock = 10;

	public boolean doOrder(int order) { // 在庫があれば注文を受け付ける
		boolean check = false; // boolean 変数追加
		
		if (stock < order) { // 注文できない場合
			throw new StockShortageException("在庫不足数：" + (order - stock));
		}
		else {
			stock = stock - order;
			check = true;
		}
		
		return check;
	}
}