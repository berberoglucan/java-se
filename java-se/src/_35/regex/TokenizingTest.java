package _35.regex;


public class TokenizingTest {
	
	public static void main(String[] args) {
		
		// amac bir content'i ufak parcalara bolmek
		
		String content = "test1,test2,test3,test4";
		
		String[] splitted = content.split(",");
		
		for (String string : splitted) {
			System.out.println(string);
		}
		 
		
		// 2
		String content2 = "test1;test2;test3;test4,test5,test6";
		
		String[] splitted2 = content2.split(";|,");
		
		for (String string : splitted2) {
			System.out.println(string);
		}
	}
	
}
