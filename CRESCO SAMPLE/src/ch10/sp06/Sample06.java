package ch10.sp06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Sample06 {
	public static void main(String[] args) {
		// 保存先のファイル名を指定する
		String filePath = "order.ser";
		Order order = new Order();
		Order order2;
		order.setCode("000001");
		order.setQuantity(7);
		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			// オブジェクトを保存する
			oos.writeObject(order);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream(filePath);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			// オブジェクトを復元する
			order2 = (Order) ois.readObject();
			System.out.println("コード:" + order2.getCode());
			System.out.println("数量:" + order2.getQuantity());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
