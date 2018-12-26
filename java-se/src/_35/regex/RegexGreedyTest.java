package _35.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGreedyTest {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(".*xx"); // greedy davranir -> bir tane sonuc cikarir
	
		Matcher m = p.matcher("yyxxxyxx");

		while (m.find()) {
			System.out.println(m.start() + " " + m.group()); // yyxxxyxx
		}
		
		Pattern p2 = Pattern.compile(".*?xx"); // ? ile-> isteksiz davranir -> beklenilen sonucu verir
		
		Matcher m2 = p2.matcher("yyxxxyxx");

		while (m2.find()) {
			System.out.println(m2.start() + " " + m2.group()); // yyxx, xyxx
		}
		
		// * -> greedy, *? -> reluctant
		// ? -> greedy, ?? -> reluctant
		// + -> greedy, +? -> reluctant
		
	}
	
}
