package _16.constructor;

class Animal {
	public Animal() {
		super();
		System.out.println("Animal Constructor");
	}
}

class Dog extends Animal {
	public Dog() {
		super(); // varsayilan olarak super ifadesi en basa konu ve her zaman en basta olmak
					// zorundadir.
		System.out.println("Dog constructor");
	}
}

public class ConstructorChaining {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("main");
	}
	
}
