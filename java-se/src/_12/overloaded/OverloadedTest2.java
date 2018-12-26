package _12.overloaded;

class Calculator2 {

	public double getTotal(double a, double b) {
		System.out.println("double double");
		return a + b;
	}

	public float getTotal(float a, float b) {
		System.out.println("float float");
		return a + b;
	}
	
	
	// 
	
	public int getTotalInteger(int a, int b) {
		System.out.println("int int");
		return a + b;
	}
	
	public int getTotalInteger(byte a, byte b) {
		System.out.println("byte byte");
		return a + b;
	}
}

public class OverloadedTest2 {

	public static void main(String[] args) {

		Calculator2 calc2 = new Calculator2();
		
		// 100.0 -> double
		calc2.getTotal(100.0, 200.0); // double double
		
		// 100.0f-> float
		calc2.getTotal(100.0f, 200.0f); // float float
		
		
		calc2.getTotalInteger(10, 20); // int int
		
		calc2.getTotalInteger((byte) 10, (byte) 20); // byte byte
	}

}
