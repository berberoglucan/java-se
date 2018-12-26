package _38.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person>{
	private int id;
	private String name;
	private String surname;
	private int age;

	public Person(int id, String name, String surname, int age) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		
		// id'ye gore siralama
		
		int value = Integer.valueOf(this.id).compareTo(o.getId());
		System.out.println(value);
		return value;
		
		// tersten idye gore
		
		// return Integer.valueOf(o.getId()).compareTo(this.id);
		
		// name'e gore
		
		// return this.name.compareTo(o.getName());
		
	}

}

public class ComparableTest {

	public static void main(String[] args) {

		Person person1 = new Person(1, "can", "berberoglu", 23);

		Person person2 = new Person(20, "suleyman", "cakiroglu", 22);

		Person person3 = new Person(5, "cem", "berberoglu", 28);

		List<Person> personList = new ArrayList<>();
		
		personList.add(person1);
		
		personList.add(person2);
		personList.add(person3);
		
		Collections.sort(personList);
		
		for (Person person : personList) {
			System.out.println(person);
		}

	}

}
