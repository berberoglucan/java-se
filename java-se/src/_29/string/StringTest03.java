package _29.string;

public class StringTest03 {

	public static void main(String[] args) {

		String str1 = "james";
		String str2 = "james";

		// iki satir sonunda string pool'da sadece 1 obje olusur.

		System.out.println(str1 == str2); // true

		// new ile olusturulan String objeler sonucu 2 adet obje olusur. Biri string
		// pool'da diðeri normal heap'te olmak üzere;

		// Bunun sonucunda heap'teki string objeleri gosterilir.

		String str3 = new String("james"); // string pool'da ve heap'te olmak uzere 2 obje olusur.
		String str4 = new String("james"); // string pool'da ve heap'te olmak uzere 2 obje olusur.

		System.out.println(str3 == str4); // false
		// str3 ve str4 heapte farkli iki objeyi gostermektedir.

		String str5 = new String("java"); // 2 obje olusur. heap'te ve string pool'da

		String str6 = "abc"; // string pool'da tek bir obje olusur.

	}

}
