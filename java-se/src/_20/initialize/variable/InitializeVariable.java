package _20.initialize.variable;

class Variable {

	int intVariable;

	byte byteVariable;

	float floatVariable;

	String stringVariable;

	@Override
	public String toString() {
		return "Variable [intVariable=" + intVariable + ", byteVariable=" + byteVariable + ", floatVariable="
				+ floatVariable + ", stringVariable=" + stringVariable + "]";
	}

}

public class InitializeVariable {
	
	public static void main(String[] args) {
		
		Variable var = new Variable();
		
		System.out.println(var);
		
	}
	
}

// javada static ve instance degiskenlere otomatik olarak deger atanir.

// byte, short, int, long -> 0

// float, double -> 0.0

// boolean -> false

// reference type -> null

// char -> '\u0000'
