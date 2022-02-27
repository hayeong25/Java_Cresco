package ch08.ex07;

import java.util.Date;

public class DateUtil {
	public static long getDiffDay(Date beforeDay, Date afterDay) {
		long oneDay = 24 * 60 * 60 * 1000;
		long diff = afterDay.getTime() - beforeDay.getTime();
		return diff / oneDay;
	}
}
