package ch08.sp04;

import java.util.Calendar;
import java.util.Date;

public class Sample04 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		calendar.set( 1973, Calendar.OCTOBER, 01 );
		
		Date date = calendar.getTime();
		long time = date.getTime();
		
		//Dateオブジェクトを標準出力した結果と、1970年1月1日 0時から計測した時間 （ミリ秒）
		System.out.println( date + " ( " + time + " ) " );

		//（参考）Calendarクラスを利用し、整形して表示
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		System.out.println(year + "年" + month + "月" + day + "日" + 
				hour + "時" + minute + "分" + second + "秒");	

	}
}
