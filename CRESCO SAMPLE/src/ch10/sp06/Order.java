package ch10.sp06;

import java.io.Serializable;

public class Order implements Serializable {
	private String code;

	private int quantity;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
