package _33.dates;

import java.util.Calendar;

public class CalendarTest {

	// Calender abstract sinif

	public static void main(String[] args) {

		// calendar objesi almak icin
		Calendar calendar = Calendar.getInstance();

		System.out.println(calendar);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH); // 0-11 arasinda deger alir.
		
		System.out.println("year : " + year + " month : " + month);
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // ayin kacin gunu
		
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // yilin kacinci gunu
		
		System.out.println(calendar.get(Calendar.WEEK_OF_YEAR)); // yilin kacinci haftasi
		
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 1 sunday, 7 saturday
		
		System.out.println(calendar.get(Calendar.HOUR)); // 12'lik saat dilimi
		
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); // 24'luk saat dilimi
		
		System.out.println(calendar.get(Calendar.MINUTE));
		
		System.out.println(calendar.get(Calendar.SECOND));
		
		// 2 yil ilerisi
		
		calendar.add(Calendar.YEAR, 2);
		
		System.out.println(calendar.get(Calendar.YEAR));
		
		// 2 saat gerisi 
		
		calendar.add(Calendar.HOUR, -2);
		
		System.out.println(calendar.getTime());
		
	}

}
