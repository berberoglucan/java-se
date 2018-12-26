package _35.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest03 {

	public static void main(String[] args) {
		
		// quantifier
		
		// + -> 1 yada daha fazla {1,}
		
		Pattern p = Pattern.compile("\\d+");
		// Pattern p = Pattern.compile("\\d{1,}"); // yukaridaki ile ayni
		// "\\d{1,2}" -> 1 ve ya 2 karakterli sayilar
		// "\\d{2,3}" -> 2 ve ya 3 karakterli sayilar
		Matcher m = p.matcher("test12 java8 regex456");

		while (m.find()) {
			System.out.println(m.start() + " " + m.group()); // 12, 8, 456
		}

		
		// * -> 0 ya da daha fazla {0,}
		
		Pattern p2 = Pattern.compile("\\d*"); // hic sayi olmayan veya daha fazla olan
		Matcher m2 = p2.matcher("test12 java8 regex456");

		while (m2.find()) {
			System.out.println(m2.start() + " " + m2.group()); 
		}
		
		
		// ? -> 0 ya da 1 {0, 1}
		
		Pattern p3 = Pattern.compile("\\d?");
		Matcher m3 = p3.matcher("test12 java8 regex456");

		while (m3.find()) {
			System.out.println(m3.start() + " " + m3.group()); 
		}
		
	}

}
