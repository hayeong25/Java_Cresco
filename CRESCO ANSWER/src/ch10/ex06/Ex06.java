package ch10.ex06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex06 {
	public static void main(String[] args) {
		String filePath = "employee.ser";
		Employee employee = new Employee();
		Employee employee2;
		employee.setId("1234567");
		employee.setName("佐藤一郎");

		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			System.out.println("オブジェクトの保存前");
			System.out.println("ID:" + employee.getId() + " 氏名:"
					+ employee.getName());
			oos.writeObject(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream(filePath);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			employee2 = (Employee) ois.readObject();

			System.out.println("オブジェクトの復元後");
			System.out.println("ID:" + employee2.getId() + " 氏名:"
					+ employee2.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
