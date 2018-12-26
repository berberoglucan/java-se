package _40.inner.classes;

public class AnonymousClassTest {

	public static void main(String[] args) {
		
		// Person class'ini extends eden anonymous class
		Person anonymousClass = new Person() {

			@Override
			public void printMessage() {
				System.out.println("Hello anonymousClass");
			}

		};
		
		anonymousClass.printMessage();
		
		System.out.println(anonymousClass.getClass()); // class _40.inner.classes.AnonymousClassTest$1
		
		// interface icin
		
		// Runnable interface'sini implements eden anonymous class
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
			}
		};

	}

}

class Person {
	public void printMessage() {
		System.out.println("Hello Message!");
	}
}

