package _21.passing.variable;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class PassingTest {

	public static void main(String[] args) {

		Person person = new Person("can", 23);

		System.out.println(person);

		change(person); // burada objenin kendisi geçmez. objenin adresi geçirilir.
		
		// reference variable -> ilgili objeti gösteren bir bir pattern'idir. ilgili adres bilgisini tutar.
		// metoda geçirilirken, kendisi degil kopyasý geçer.
		// her zaman degiskenin kopyasý alýnýr, kopyasý metoda geçer.
		
		System.out.println(person);
		
	}

	public static void change(Person personRef) {
		System.out.println(personRef);
	
		personRef.name = "cem";
		
		personRef.age = 30;
		
		personRef = null; // obje ucmaz sadece objenin adres bilgisi gider.
	}

}
