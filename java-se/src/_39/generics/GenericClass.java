package _39.generics;

public class GenericClass {

	public static void main(String[] args) {

		GenericTypes<Integer> genericInteger = new GenericTypes<>(10);

		GenericTypes<String> genericString = new GenericTypes<>("can");

		System.out.println(genericInteger.getGenericReference());

		System.out.println(genericString.getGenericReference());

		//

		Integer[] i = { 1, 2, 3, 5, 6 };

		Double[] d = { 1.4, 2.5, 3.3, 5.4, 6.0 };

		Boolean[] b = { true, false, true };

		Person[] p = { new Person(), new Person() };

		GenericTypes.staticGenericMethod(i);
		GenericTypes.staticGenericMethod(d);
		GenericTypes.staticGenericMethod(b);
		GenericTypes.staticGenericMethod(p);

	}
	
	
	// class'ta kullanmazsak boyle kullanabiliriz.
	public <T> void genericMethod(T[] array) {
		for (T t : array) {
			System.out.print(t + " ");
		}
	}

}

class GenericTypes<T> {
	private T genericReference;

	public GenericTypes(T genericReference) {
		super();
		this.genericReference = genericReference;
	}

	public GenericTypes() {
		super();
	}

	public T getGenericReference() {
		return genericReference;
	}

	public void setGenericReference(T genericReference) {
		this.genericReference = genericReference;
	}

	// static icin asagidaki gibi ekstra bir tanimlama gereklidir.
	public static <T> void staticGenericMethod(T[] array) {
		for (T t : array) {
			System.out.print(t + " ");
		}
	}

}

class Person {

}

// E -> Element
// K -> Key
// V -> Value
// T -> Type
// N -> Number