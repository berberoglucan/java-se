package _37.collections;

import java.util.ArrayList;
import java.util.List;


class Person {

	private String name;

	private String surname;

	private int age;

	public Person(String name, String surname, int age) {
		super();
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		if (age != other.age) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (surname == null) {
			if (other.surname != null) {
				return false;
			}
		} else if (!surname.equals(other.surname)) {
			return false;
		}
		return true;
	}

}

public class ListTest04 {

	public static void main(String[] args) {
		
		Person person = new Person("can", "berberoglu", 23);
		
		Person person2 = new Person("kemal", "yilmaz", 22);
		
		Person person3 = new Person("cem", "berberoglu", 28);
		
		List<Person> listPerson = new ArrayList<>();
		
		listPerson.add(person);
		
		listPerson.add(person2);
		
		listPerson.add(person3);
		
		Person search = new Person("can", "berberoglu", 23);
		
		// contains icin equals override edilmeli
		System.out.println(listPerson.contains(search)); // true
		
		
	}

}




































