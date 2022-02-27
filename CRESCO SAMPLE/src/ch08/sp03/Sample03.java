package ch08.sp03;

import java.util.Calendar;

public class Sample03 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DATE);
		System.out.println(year + "年" + month + "月" + day + "日");

		calendar.add(Calendar.DATE, -20);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH) + 1;
		day = calendar.get(Calendar.DATE);
		System.out.println(year + "年" + month + "月" + day + "日");
	}
}
