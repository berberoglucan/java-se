package _34.format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
	
	public static void main(String[] args) {
		double salary = 1567.897;
		
		NumberFormat nf = NumberFormat.getInstance();
		
		System.out.println(nf.format(salary)); //1.567,897
		
		// tr format
		
		NumberFormat nfTR = NumberFormat.getInstance(new Locale("tr", "TR"));
		
		System.out.println(nfTR.format(salary));
	}
	
}

// NumberFormat -> abstract class
