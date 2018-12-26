package _28.checked.exceptions;

import java.io.FileNotFoundException;

public class Test02 {

	public static void main(String[] args) {
		
		// testMethod exception firlatabilecegi icin try-catch ile handle yapariz.
		
		try {
			testMethod();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		testMethodNull();
		
	}

	public static void testMethod() throws FileNotFoundException {
		
		 // throws -> bu metot bir exception firlatabilir anlaminagelir.

		throw new FileNotFoundException(); // checked exception

	}
	
	public static void testMethodNull() throws NullPointerException {
		
		// NullPointerException bir unchecked exception'dir.
		// handle or declare islemi gerektirmez.
		// pratikte throws ifadesinde unchecked exception yer almaz.
		
		throw new NullPointerException();
		
	}

}
