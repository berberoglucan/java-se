package _35.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest01 {

	public static void main(String[] args) {

		// icinde n harfi gecen
		Pattern p = Pattern.compile("n");

		Matcher m = p.matcher("can berberoglu");

		while (m.find()) {
			System.out.println(m.start());
		}

		// 2

		Pattern p2 = Pattern.compile("ber");

		Matcher m2 = p2.matcher("can berberoglu");

		while (m2.find()) {
			System.out.println(m2.start() + " " + m2.group());
		}

		// 3

		Pattern p3 = Pattern.compile("b|e"); // b veya e

		Matcher m3 = p3.matcher("can berberoglu");

		while (m3.find()) {
			System.out.println(m3.start() + " " + m3.group());
		}
		
		// 4
		
		Pattern p4 = Pattern.compile("[a-i]"); // a ile i arasinda herhangi bir karakter

		Matcher m4 = p4.matcher("can berberoglu");

		while (m4.find()) {
			System.out.println(m4.start() + " " + m4.group());
		}

	}

}
