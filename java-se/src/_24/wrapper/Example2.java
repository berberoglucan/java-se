package _24.wrapper;

public class Example2 {

	public static void main(String[] args) {
		// valueOf

		Integer number = Integer.valueOf("100"); // String -> wrapper

		Float salary = Float.valueOf("100.5f");

		System.out.println(salary);

		// xxxValue -> wrapper to primitive

		Integer i1 = new Integer(100);
		int i2 = i1.intValue();

		// parseXXX -> String to primitive

		int number2 = Integer.parseInt("100");
	}

}
