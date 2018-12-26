package _34.format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberCurrencyFormatTest {
	
	public static void main(String[] args) {
		
		NumberFormat nCurrencyGE = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		
		double salary = 1124.567;
		
		System.out.println(nCurrencyGE.format(salary)); //1.124,57 €
		
		// tr
		
		NumberFormat nCurrencyTR = NumberFormat.getCurrencyInstance(new Locale("tr", "TR"));
		
		System.out.println(nCurrencyTR.format(salary)); // 1.124,57 TL
		
	}
	
}
