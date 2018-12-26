package _12.overloaded;

class Calculator {
	
	public int getTotal(int a, int b) {
		System.out.println("int int");
		return a + b;
	}
	
	public double getTotal(double a, double b) {
		System.out.println("double double");
		return a + b;
	}
	
}


public class OverloadedTest {

	public static void main(String[] args) {
			
		Calculator calc = new Calculator();
		
		calc.getTotal(100, 200); // int int
		
		calc.getTotal(100.0, 200.0); // double double
		
		calc.getTotal(100, 200.0); // int double yok double double cagirir.
	}
	
}

// metotlarin isimleri ayni, parametreleri farkli olmalidir.(sayica ve ya degisken tipi farkli)

// overloaded kavrami metotlar ve constructor icin gecerlidir