package _39.generics;


public class GenericExample01 {
	
	public static void main(String[] args) {
		
		// List<Animal> animalDogList = new ArrayList<Dog>(); // compiler error
		// yukaridaki sekilde kullanilamaz. sol taraf ve sag taraf ayni tip olmalidir
		
		
		// dizilerde gecerlidir
		
		Animal[] animalDogArray = new Dog[5]; 
		
		animalDogArray[0] = new Dog();
		
		animalDogArray[1] = new Cat(); // java.lang.ArrayStoreException
		// Cat IS-A Dog olmadigi icin runtime'da exception aliriz.
		
	}
	
}

interface SuperAnimal {
	
}

class Animal implements SuperAnimal {
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}

class Kangal extends Dog {
	
}