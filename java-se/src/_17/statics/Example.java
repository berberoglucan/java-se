package _17.statics;

public class Example {

	String name = "can"; // instance variable objeye baglidir. obje yoksa degiskene erisim saglanamaz.

	public void pringMessage() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {

		// static metotardan direk olarak instance degiskene erisim yoktur.
		// Bu noktada metot static oldugu icin obje yoktur.
		
		// System.out.println(name); // compiler error

		Example example = new Example();

		System.out.println(example.name);
		
		// ayni sey instance metotlar icinde gecerlidir.
		
		// printMessage(); // compiler error.
		
		example.pringMessage();

	}

}
