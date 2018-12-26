package _05.classMembers.nonaccess;

public class NonAccessMethod {

}

// final, abstract, native, synchorinized

// ### final metotlar -> final metotlar override edilemezler.

class SuperClass {

	public void nonFinalMethod() {
	}

	public final void finalMethod() {
	}

}

class SubClass extends SuperClass {

	@Override
	public void nonFinalMethod() {
	}
	
	// derleme hatasi
	/* @Override
	public final void finalMethod() {
	}*/ 
	
}


// ### abstract metotlar 

 // bir metot abstract ise metot govdesiz olmalidir ve ilgili class abstract olmalidir.


abstract class Abstract1 {
	
	// bir sinif icersinde bir tane bile abstract metot varsa, class abstract olmalidir.
	
	abstract void test1();
	
}

abstract class Abstract2 {
	
	// abstract bir class icerisinde abstract bir metot olmak zorunda degildir.
    void test2() {
		
	}
	
}


















