package ch08.ex05;

import java.util.Calendar;

public class Ex05 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		System.out.print(rightNow.get(Calendar.YEAR) + "年");
		System.out.print((rightNow.get(Calendar.MONTH) + 1) + "月");
		System.out.print(rightNow.get(Calendar.DATE) + "日");
		System.out.print(rightNow.get(Calendar.HOUR) + "時");
		System.out.print(rightNow.get(Calendar.MINUTE) + "分");
	}
}
