package _33.dates;

import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date); // Fri Dec 14 16:52:29 EET 2018
		
		Long time = date.getTime(); // unix epoch time 1.1.1970
 		
		System.out.println(time);
		
		long time2 = System.currentTimeMillis(); // unix epoch time 1.1.1970
		System.out.println(time2);
		
	}
	
	// Date class'i yerine Calendar kullanmak daha dogru olacaktir.
}
