package ch09.ex01;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		List<String> employees = new ArrayList<String>();
		employees.add("佐藤");
		employees.add("鈴木");
		employees.add("田中");
		employees.add("斉藤");

		for (String employee : employees) {
			System.out.println(employee);
		}
	}
}
