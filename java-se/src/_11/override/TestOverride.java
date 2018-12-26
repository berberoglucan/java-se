package _11.override;

// override kavramindan bahsedebilmek icin extends veya implements olmasi gereklidir.

class Animal {
	
	int size = 100;
	
	public void eat() {
		System.out.println("Animal#eat");
	}
	
	public static void run() {
		System.out.println("Animal#run");
	}
}

class Dog extends Animal {
	
	int size = 10;
	
	@Override
	public void eat() {
		System.out.println("Dog#eat");
	}
	
	// @Override // hata verir. static metotlar override edilemez.
	public static void run() {
		System.out.println("Dog#run");
	}

}

public class TestOverride {
	public static void main(String[] args) {
		Animal animal = new Animal();
		// degisken tipi reference type
		// degisken main icinde oldugu icin local variable stackte yasar.
		// (sol taraf) degiskenin tipi Animal
		// (sag taraf) objenin tipi Animal

		animal.eat(); // Animal#eat

		Dog dog = new Dog();

		// degisken tipi reference type
		// degisken main icinde oldugu icin local variable stackte yasar.
		// (sol taraf) degiskenin tipi Dog
		// (sag taraf) objenin tipi Dog

		dog.eat(); // Dog#eat

		Animal animalDog = new Dog();
		// degisken tipi reference type
		// degisken main icinde oldugu icin local variable stackte yasar.
		// (sol taraf) degiskenin tipi Animal
		// (sag taraf) objenin tipi Dog

		animalDog.eat(); // Dog#eat
		// override metotlar söz konusu oldugunda, dynamic dispatch yaklasimi uygulanir.
		// runtime'da objenin tipine bakilarak hangi metodun calisacagina karar verilir.

		// Dog dogAnimal = new Animal(); // derleme hatasi
		
		// ### instance ve static degiskenler icin override söz konusu deðildir.
		Animal animal2 = new Animal();
		System.out.println(animal2.size); // 100
		
		Dog dog2 = new Dog();
		System.out.println(dog2.size); // 10
		
		// burada deðiþkenin deðeri Animal oldugu icin int size = 100 degeri yazýlýr.
		Animal animalDog2 = new Dog();
		System.out.println(animalDog2.size); // 100
		
		// ### static metotlar icin override söz konusu degildir.
		Animal animal3 = new Animal();
		animal3.run(); // Animal#run
		
		Dog dog3 = new Dog();
		dog3.run(); // Dog#run
		
		Animal animalDog3 = new Dog();
		animalDog3.run(); // Animal#run
	}
}

// GENEL KURAL : Java'da bir reference variable kendi tipinde ve ya subclass'ý  tipinde bir objeyi gösterebilir. 
