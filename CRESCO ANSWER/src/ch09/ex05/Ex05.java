package ch09.ex05;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("佐藤");
		list.add("鈴木");
		list.add("田中");
		list.add("斉藤");

		Iterator<String> iter = list.iterator();

		while (iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}
	}
}
