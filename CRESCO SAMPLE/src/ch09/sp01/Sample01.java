package ch09.sp01;

import java.util.List;
import java.util.ArrayList;

public class Sample01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("山田");
		list.add("斎藤");
		list.add("佐藤");
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			System.out.println(name);
		}
	}
}
