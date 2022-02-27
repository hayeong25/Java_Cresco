package ch08.ex06;

import java.util.Calendar;

public class Ex06 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		System.out.print("本日:");
		System.out.print(rightNow.get(Calendar.YEAR) + "年");
		System.out.print((rightNow.get(Calendar.MONTH) + 1) + "月");
		System.out.print(rightNow.get(Calendar.DATE) + "日");
		System.out.println("");
		
		System.out.print("昨日:");
		rightNow.add(Calendar.DATE, -1);
		System.out.print(rightNow.get(Calendar.YEAR) + "年");
		System.out.print((rightNow.get(Calendar.MONTH) + 1) + "月");
		System.out.print(rightNow.get(Calendar.DATE) + "日");
		System.out.println("");
		
		System.out.print("明日:");
		rightNow.add(Calendar.DATE, +2);
		System.out.print(rightNow.get(Calendar.YEAR) + "年");
		System.out.print((rightNow.get(Calendar.MONTH) + 1) + "月");
		System.out.print(rightNow.get(Calendar.DATE) + "日");
	}
}
