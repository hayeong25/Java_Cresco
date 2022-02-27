package ch08.ex07;

import java.util.Calendar;
import java.util.Date;

public class Ex07 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();

		rightNow.set(2006, Calendar.OCTOBER, 01);
		Date before = rightNow.getTime();
		
		rightNow.set(2007, Calendar.JANUARY, 10);
		Date after = rightNow.getTime();
		long diff = DateUtil.getDiffDay(before, after);
		System.out.println("日数差は" + diff + "日です");
	}
}
