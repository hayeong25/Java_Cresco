package ch09.sp02;

import java.util.List;
import java.util.LinkedList;

public class Sample02 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("山田");
		list.add("斎藤");
		list.add("佐藤");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
