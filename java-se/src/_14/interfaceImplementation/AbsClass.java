package _14.interfaceImplementation;

public abstract class AbsClass implements Bounceable, Moveable {
	// abstract classlar interface metotlarini override etmek zorunda degildir.
	abstract void testMethod();

}

class SubClass extends AbsClass {

	@Override
	public void bounce() {

	}

	@Override
	public void setBounceFactor(int bf) {

	}

	@Override
	void testMethod() {

	}

	@Override
	public void moveIt() {
		
	}

}