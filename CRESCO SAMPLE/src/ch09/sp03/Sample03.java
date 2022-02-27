package ch09.sp03;

import java.util.Map;
import java.util.HashMap;

public class Sample03 {
	public static void main(String[] args) {
		Map<String, Product> products = new HashMap<String, Product>();
		Product product1 = new Product("机", 22000);
		Product product2 = new Product("椅子", 18000);
		Product product3 = new Product("PC", 120000);
		products.put("desk", product1);
		products.put("chair", product2);
		products.put("pc", product3);
		Product product4 = products.get("chair");
		System.out.println(product4.getName());
	}
}
