package _13.reference.variable.casting;

class Animal {
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}


public class CastingTest {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		// DOWNCASTING-> risk var
		Dog dog = (Dog) animal; // ClassCastException(runtime'da)
		
		// dog referans degiskeni kendi tipinde ya da subclass tipinde
		// bir objeyi gösterebilir. super class tipinde bir objeyi gösteremez.
		
		Animal animalDog = new Dog();
		
		Dog dogValid = (Dog) animalDog; // no exception
		
		
		// UPCASTING -> risk yok
		Cat cat = new Cat();
		Animal animal1 = cat;
		
		Dog dog1 = new Dog();
		Animal animal2 = dog1;
	}
	
}
