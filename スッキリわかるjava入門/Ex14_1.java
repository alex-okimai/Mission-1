package j14;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Ex14_1 {
	public static void main(String[] args) {
		//現在の日時をDate型で取得
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		//取得した日時情報をCalendarの日にセット
		c.setTime(now);
		//Calendarから日の情報を取得
		int day = c.get(Calendar.DAY_OF_MONTH);
		//取得した値に100を足してCalendarの日にセット
		day += 100;
		c.get(Calendar.DAY_OF_MONTH);
		//Calendarの日付情報をDate型に変換
		Date future = c.getTime();
		//指定された形式で表示
		SimpleDateFormat f = new SimpleDateFormat("西歴yyyy年MM月dd日");
		System.out.println(f.format(future));
	}
}
