package _39.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample02 {

	public static void main(String[] args) {

		List<Animal> animalList = new ArrayList<>();

		addElement(animalList);

		System.out.println(animalList);

		List<Dog> dogList = new ArrayList<>();

		// addElement(dogList); // compiler error
		// eger gonderilseydi icine Cat ve Animal tipinde bir obje eklenmeye calisildigi
		// icin hata verecekti.
		
		Dog[] dogs = new Dog[3];
		addElementArray(dogs); // Cat IS-A Dog degil bu nedenle runtime'da exception'a neden olur.
		// java.lang.ArrayStoreException

	}

	public static void addElement(List<Animal> animalList) {
		animalList.add(new Dog());
		animalList.add(new Cat());
		animalList.add(new Animal());
	}
	
	public static void addElementArray(Animal[] animal) {
		animal[0] = new Cat();
	}

}
