package _29.string;

public class StringTest01 {

	public static void main(String[] args) {

		String name = "old"; // string pool'da "old" literali olusur.

		name = "new name"; // string pool'da "new name" literal olusur. "old" cop hukmundedir.

		System.out.println(name);

		// All literal strings and string-valued constant expressions are interned.

		String str1 = "java"; // string pool'da "java" literal olarak olusur.
		String str2 = "java"; // daha once "java" olustugu icin yeniden olusmaz.
		// str1 ve str2 ayni objeyi gosterir.

		System.out.println(str1 == str2); // true

		String str3 = "java8";
		String str4 = "java" + "8";
		// string poolda java8 literali olusur. diger statement'da string pool'da oldugu
		// icin "java8" objesini gosterir.

		System.out.println(str3 == str4); // true;

		String str5 = "java8";
		String str6 = "java" + getValue();

		System.out.println(str5 == str6); // false
		
		

		// String'ler icin == kontrolu kullanilmamali
		// Bunun yerine equals metodu kullanilmalidir.

	}

	public static String getValue() {
		return "8";
	}

}
