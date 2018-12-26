package _39.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample03 {

	public static void main(String[] args) {

		List<Animal> animalList = new ArrayList<>();

		addElementGenericRule(animalList); // genel generic kurali

		// ? extends Animal -> Animal ve subclass'lari verebiliriz.
		List<Dog> dogList = new ArrayList<>();

		addElementWildCards(dogList);

		List<Cat> catList = new ArrayList<>();

		addElementWildCards(catList);

		addElementWildCards(animalList);
		
		// ? super Dog -> Dog ve superclass'larini verebiliriz.
		
		addElementWildCardSuper(dogList);
		// addElementWildCardSuper(catList); compiler error
		addElementWildCardSuper(animalList);
		
		List<Kangal> kangalList = new ArrayList<>();
		
		// addElementWildCardSuper(kangalList); // compiler error
		
		List<Object> objectList = new ArrayList<>();
		
		addElementWildCardSuper(objectList); // object'te gidebilir
		

	}

	public static void addElementGenericRule(List<Animal> animals) {

	}

	// ? extends Animal -> Animal ve subclass'lari verebiliriz.
	// ? extends interface 'de kullanilabilir.
	public static void addElementWildCards(List<? extends Animal> animals) {

		// ? wildcard'i ile extends kullanildiginda burada eleman EKLEMEYE IZIN
		// VERMEZ!!!

		// compiler error
		// animals.add(new Cat());
		// animals.add(new Dog());
		// animals.add(new Animal());

		// sadece null deger ekleyebiliriz
		animals.add(null);

	}

	// ? super Dog -> Dog ve superclass'larini verebiliriz.
	public static void addElementWildCardSuper(List<? super Dog> dogs) {
		
		// eleman eklerken sadece Dog ve subclass'lari eklenebilir.
		dogs.add(new Kangal());
		dogs.add(new Dog());
		// dogs.add(new Animal()); compiler error
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
