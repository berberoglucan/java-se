package _40.inner.classes;

public class LocalInnerClassTest {
	
	private String password = "1234";
	
	public void method2() {
		
	}
	
	public static void main(String[] args) {

		LocalInnerClassTest classTest = new LocalInnerClassTest();
		
		classTest.createMyLocalClass();
		
	}

	public void createMyLocalClass() {

		String name = "test";
		
		// name = "test2"; // degisken final olmali. Yoksa compiler error
		
		// bu class sadece ilgili scope icinde kullanilabilir.
		// static metod ve ya degisken tanimlanamaz.
		class LocalInner {

			private void method() {
				System.out.println(name);
				// localInnerClass outer class'in metotlarina ve degiskenlerine erisim saglayabilir.
				System.out.println(password);
			}

		}
		
		LocalInner inner = new LocalInner();
		inner.method();

	}

}
