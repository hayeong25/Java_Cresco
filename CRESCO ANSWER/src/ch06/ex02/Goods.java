package ch06.ex02;

public class Goods {
	private int stock = 10;

	public void doOrder(int order) throws StockShortageException {
		if (stock < order) {
			throw new StockShortageException("在庫不足数：" + (order - stock));
		}
		stock = stock - order;
	}
}