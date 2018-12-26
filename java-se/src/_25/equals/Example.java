package _25.equals;

public class Example {

	public static void main(String[] args) {

		// varsayilan olarak -128 ile 127 arasýndak deðerlerin durumu

		Integer i1 = 100;
		Integer i2 = 100;

		System.out.println(i1 == i2); // true

		Integer i3 = 1000;

		Integer i4 = 1000;

		System.out.println(i3 == i4); // false

		// varsayilan olarak -128 ile 127 arasýnda == true doner(autoboxing ile)

		// new ile her zaman yeni obje oluþur.

		Integer i5 = new Integer(100);

		Integer i6 = new Integer(100);

		System.out.println(i5 == i6); // false

		// wrapper tipler için == kontrolü yerine equals kullanmalýyýz.

		Integer number1 = 100;

		Integer number2 = 100;

		if (number1.equals(number2)) {
			//
		}

		// primitive tipler icin ==

		// biri long biri integer tipinde ise equals false doner
		Long longWrapper = 100L;

		Integer intWrapper = 100;

		System.out.println(intWrapper.equals(longWrapper)); // false

	}

}
