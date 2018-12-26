package _33.dates;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {

		Date date = new Date();

		DateFormat df = DateFormat.getInstance();

		// default format

		String formatting = df.format(date);

		System.out.println(formatting);

		// full format

		DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL);

		System.out.println(dfFull.format(date));

		// medium format

		DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);

		System.out.println(dfMedium.format(date));
		
		// short format

		DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT);

		System.out.println(dfShort.format(date));

	}

}

// java.text.DateFormat
// java.text.SimpleDateFormat