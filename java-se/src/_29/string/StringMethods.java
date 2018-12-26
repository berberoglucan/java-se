package _29.string;

public class StringMethods {

	public static void main(String[] args) {

		String name = "";

		System.out.println(name.isEmpty()); // true

		name = "james";

		System.out.println(name.isEmpty()); // false

		System.out.println(name.length());

		System.out.println(name.charAt(2)); // 2.karakteri verir

		String str1 = new String("java");

		String str2 = new String("JAVA");

		System.out.println(str1.equals(str2)); // false

		System.out.println(str1.equalsIgnoreCase(str2)); // true

		System.out.println(str1.substring(2, 4));
		
		System.out.println(str1.contains("ja"));
		
		System.out.println(str1.endsWith("va"));
		
		System.out.println(str1.startsWith("ja"));
		
	}

}
