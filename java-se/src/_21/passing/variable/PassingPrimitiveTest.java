package _21.passing.variable;

public class PassingPrimitiveTest {

	public static void main(String[] args) {

		int number = 100;

		addNumber(number); // burada değişkenin kopyası alınır, kopyası metoda gecer.
		// burada degisken 100 degerini temsil eden bit pattern'i formatindadir.

		System.out.println(number);
	}

	private static void addNumber(int number) {
		number += 10;

		System.out.println(number);
	}

}
