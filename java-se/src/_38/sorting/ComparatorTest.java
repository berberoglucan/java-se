package _38.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {

		Person2 person1 = new Person2(1, "can", "berberoglu", 23);

		Person2 person2 = new Person2(20, "suleyman", "cakiroglu", 22);

		Person2 person3 = new Person2(5, "cem", "berberoglu", 28);

		List<Person2> personList = new ArrayList<>();

		personList.add(person1);

		personList.add(person2);
		personList.add(person3);

		Collections.sort(personList, new PersonComparator());

		for (Person2 person : personList) {
			System.out.println(person);
		}

		Collections.sort(personList, new PersonAgeComparator());

		for (Person2 person : personList) {
			System.out.println(person);
		}

	}

}

class PersonComparator implements Comparator<Person2> {

	@Override
	public int compare(Person2 o1, Person2 o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class PersonAgeComparator implements Comparator<Person2> {

	@Override
	public int compare(Person2 o1, Person2 o2) {
		return Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
	}

}

class Person2 {
	private int id;
	private String name;
	private String surname;
	private int age;

	public Person2() {
		super();
	}

	public Person2(int id, String name, String surname, int age) {
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

}
