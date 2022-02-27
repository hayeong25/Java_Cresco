package ch09.sp04;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Sample04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("山田");
		list.add("斎藤");
		list.add("佐藤");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}
	}
}
