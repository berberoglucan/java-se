package _04.interfacedecleration;

public class InterfaceDecleration {

}

//interface keyword
//interfacelerin metotlari varsayilan olarak abstract yapiya sahiptirler!
//metotlari publictir, private ya da protected metot olamaz!

interface TestInterface {
	
	
	// degiskenleri-> public static final ozellige sahiptir.
	
	int NUMBER = 10; // public static final int number =10;
	
	void testMethod1(); // public abstract void testMethod1();
	
	
}

class TestClass implements TestInterface {

	@Override
	public void testMethod1() {
		
	}
	
}