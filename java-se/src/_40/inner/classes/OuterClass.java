package _40.inner.classes;

public class OuterClass {
	
	// outer class inner class'in private - public uyelerine erisim saglayabilir.
	// inner class outer class'in private - public uyelerine erisim saglayabilir.
	
	private String name = "test";
	
	public void createInnerObject()  {
		RegularInnerClass inner = new RegularInnerClass();
		System.out.println(inner.password);
		
		StaticNestedClass static2 = new StaticNestedClass();
		System.out.println(static2.name);
		System.out.println(StaticNestedClass.staticName);
	}
	
	// inner class'lar private protected default ve public olabilir.
	
	
	// non-static inner class
	private class RegularInnerClass {
		
		private String password = "1234";
		
		// private static String compilerError = "test"; // non-static inner class'larda static degisken tanimlanamaz.
		
		private void printMessage() {
			System.out.println(name); // inner class outer class'in private uyelerine erisim saglayabilir.
		}
		
	}
	
	// static inner class
	protected static class StaticNestedClass {
		
		private String name = "test";
		private static String staticName = "test12"; // static nested class'ta static degisken tanimlanabilir.
		
	}
	
	
	
	// main
	public static void main(String[] args) {
		// RegularInnerClass inner = new RegularInnerClass(); // compiler error
		
		// once outer class objesi gerekli ardindan inner class'in objesi olusturulabilir.
		
		OuterClass outer = new OuterClass();
		RegularInnerClass inner = outer.new RegularInnerClass();
		inner.printMessage();
		
		// ve ya
		
		OuterClass.RegularInnerClass inner2 = new OuterClass().new RegularInnerClass();
		
		// static icin
		StaticNestedClass staticClass = new StaticNestedClass();
	}
	
}
