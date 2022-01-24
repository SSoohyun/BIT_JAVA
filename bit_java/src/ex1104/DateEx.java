package ex1104;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		Date now = new Date();
//		String strNow1 = now.toString();
		System.out.println(now);
		
		/*
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		*/
		
		// Calendar
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1); // 0~11로 +1
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 1~7로 일요일부터 1
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.AM_PM)); // 오후는 1
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		
		today.clear();
		today.set(2019, 11, 25); // 2019-12-25
		today.set(Calendar.HOUR_OF_DAY, 20); // 오후 8시
		today.set(Calendar.MINUTE, 30); // 30분
		System.out.println(today.getTime());
		
		// 예제
		Calendar calendar = Calendar.getInstance();
		System.out.println("현재는 : " + calendar.getTime());
		calendar.add(Calendar.DATE, -15);
		System.out.println("15일 전은 : " + calendar.getTime());
		calendar.add(Calendar.MONTH, 4);
		System.out.println("4개월 후는 : " + calendar.getTime());
		calendar.add(Calendar.YEAR, 2);
		System.out.println("2년 후는 : " + calendar.getTime());
	}

}
