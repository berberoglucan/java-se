package _33.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("MM-dd-yyyy");
		
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("dd/MM/yyyy E HH:mm:ss.SSS a");
		
		System.out.println(sdf.format(date));
		
	}
	
}
// d -> day
// M -> month
// y -> year
// H -> hour
// m -> minute
// s -> second
// S -> milisecond
// a -> AM/PM