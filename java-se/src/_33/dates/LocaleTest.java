package _33.dates;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		
		// Locale[] locales  = Locale.getAvailableLocales();
		
		// tum kullanilabilir locale'ler
		
		/* for (Locale locale : locales) {
			System.out.println(locale);
		} */
		
		// default locale
		
		Locale locale2 = Locale.getDefault();
		
		System.out.println(locale2); 
		
		// localeTR
		
		Locale localeTR = new Locale("tr", "TR");
		
		System.out.println(localeTR.getCountry()); // TR
		
		System.out.println(localeTR.getLanguage()); // tr
		
		System.out.println(localeTR.getDisplayCountry()); // T�rkiye
		
		System.out.println(localeTR.getDisplayLanguage()); // T�rk�e
		
		System.out.println(localeTR.getDisplayLanguage(localeTR)); // T�rk�e
		
	}
	
}
