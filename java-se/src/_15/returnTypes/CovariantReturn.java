package _15.returnTypes;


class Computer {
	
}

class Laptop extends Computer {
	
}


class SuperClass {
	
	public Computer getComputer() {
		return new Computer();
	}
	
}

class SubClass extends SuperClass {
	
	
	// Laptop IS-A Computer oldugu icin bu override metot icin donus tipini degistirebiliriz.
	// covariant return
	@Override
	public Laptop getComputer() {
		return new Laptop();
	}
	
}



public class CovariantReturn {

}
