package _07.varargs;

public class VarArgTest {

	public static void main(String[] args) {
		varArgTestMethod();
		varArgTestMethod(10);
		varArgTestMethod(10, 20);
		varArgTestMethod(10, 20, 30);
	}

	// int... number -> var arg
	public static void varArgTestMethod(int... number) {
		// System.out.println(number.length);
		for (int i : number) {
			System.out.println(i);
		}
		
	}

	// bir metotta sadece 1 tane var arg olabilir
	// var arg yapisi ile normal variable kullanilabilir , bu durumda var arg
	// metodun sonunda olmalidir.
}
