package _33.dates;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleTest02 {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		// germany
		DateFormat dfGE = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY);
		
		System.out.println(dfGE.format(date));
		
		
		// italy
		
		DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALY);
		
		System.out.println(dfIT.format(date));
		
		// turkey
		
		DateFormat dfTUR = DateFormat.getDateInstance(DateFormat.FULL, new Locale("tr", "TR"));
		
		System.out.println(dfTUR.format(date));
	}
	
}
