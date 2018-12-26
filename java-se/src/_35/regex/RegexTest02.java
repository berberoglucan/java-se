package _35.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest02 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abababa");

		while (m.find()) {
			System.out.println(m.start()); // 0 2 4
		}

		Pattern p2 = Pattern.compile("aba");
		Matcher m2 = p2.matcher("abababa"); // kullanilan karakter bir kez kullanilir bir daha kullanilmaz.

		while (m2.find()) {
			System.out.println(m2.start()); // 0 4
		}
		
		
		// meta character
		Pattern p3 = Pattern.compile("\\d"); // \d digit [0-9]
		Matcher m3 = p3.matcher("test12 java8"); // tek bir sayi iceren

		while (m3.find()) {
			System.out.println(m3.start() + " " + m3.group()); // 1 2 ve 8
		}
		
		Pattern p4 = Pattern.compile("\\d\\d"); // \d digit [0-9]
		Matcher m4 = p4.matcher("test12 java8"); // yan yana iki rakam iceren

		while (m4.find()) {
			System.out.println(m4.start() + " " + m4.group()); // 12
		}
		
		Pattern p5 = Pattern.compile("\\s"); // \s whitespace
		Matcher m5 = p5.matcher("test12 java8"); // 

		while (m5.find()) {
			System.out.println(m5.start() + " " + m5.group()); 
		}
		
		Pattern p6 = Pattern.compile("\\w"); // \w harf rakam dahil bosluk yok
		Matcher m6 = p6.matcher("test12 java8"); // 

		while (m6.find()) {
			System.out.println(m6.start() + " " + m6.group()); 
		}
		
		Pattern p7 = Pattern.compile("t.s"); // . -> herhangi bir karakter gelsin anlaminda kullanilir
		Matcher m7 = p7.matcher("test12 java8"); // baslangic t, bitis s

		while (m7.find()) {
			System.out.println(m7.start() + " " + m7.group()); 
		}
		
		Pattern p8 = Pattern.compile("t\\.s"); // t.s ' yi bul. \\ kacis karakteri olarak kullanilinca o karakter olmali
		Matcher m8 = p8.matcher("test12 java8 t.s");

		while (m8.find()) {
			System.out.println(m8.start() + " " + m8.group()); 
		}
	}

}
