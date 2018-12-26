package _27.handling.exception;

public class Test01 {

	public static void main(String[] args) {

		int number = 100;

		// try - catch

		try {
			System.out.println(number / 0);
			System.out.println("not work!");
		} catch (ArithmeticException e) {
			System.out.println("catch");
		}

		// try ve finally bloklari tek olarak kullanilamaz

		// try-finally

		try {

		} finally {
			
		}

		// try-catch-finally

		try {
			String str = null;
			System.out.println(str.toLowerCase());
			System.out.println("not work!");
		} catch (NullPointerException e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally - her zaman calisir.");
		}

	}

}
