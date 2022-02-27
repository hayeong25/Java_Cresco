package ch11.sp03;

public class OrderThread extends Thread {
	private Product product;
	private int orderNum;
	
	public OrderThread(Product product, int orderNum){
		this.product = product;
		this.orderNum = orderNum;
	}
	@Override
	public void run() {
		try	{
			synchronized(product){
				int zaiko = product.getZaiko();
				zaiko = zaiko - orderNum;
				sleep(1000);
				product.setZaiko(zaiko);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		System.out.println(orderNum + "個減らしました　在庫：" + product.getZaiko());
	}
}
