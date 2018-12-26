package _16.constructor;

// 1) Constructor'lar private dahil bütün access levellere sahip olabilir.

class AccessLevel {
	private AccessLevel() {
	}
}

// 2) constructor ile class ismi ayni olmak zorundadir.

class Name {
	/*
	 * Name2() {
	 * 
	 * }
	 */ // derleme hatasi
}

// 3) constructorlar'in donus tipi olamaz. void dahi olamaz.

// 4) her class icin varsayilan olarak, eger constructor tanimlanmamissa no-arg constuctor tanimlanir.

// 5) super() ifadesi constructor'larin basinda yer almalidir.

class SuperClass {
	public SuperClass() {
		// System.out.println("Compiler error!");
		// super();
	}
}

// 6) this ile bir constructor icerisinden diger consturctor'ý cagirabiliriz.
// Baska bir metod icersinden constructor'i cagiramayiz.

class ThisClass {
	public ThisClass() {
		// super(); this ve super anahtar kelimesi ayni anda kullanilamaz.
		this(10); // super gibi this ifadesi'de calisan ilk statement olmalidir.
	}

	public ThisClass(int number) {
	}
}

// 7) abstract classlar'in constuctori olmalidir. Buradaki amaç constructor chaining'i saglamaktir. Normalde abstract class'lardan obje olusturulamaz.

// 8) interface'lerin constructor'ý yokturç

interface MyInterface {
	/* MyInterface() {
		
	}*/ // derleme hatasi
}

// 9) constructor'lar override edilemez. overloaded olabilir.

public class ConstructorRules {

}
