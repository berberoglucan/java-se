package _37.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest04 {

	public static void main(String[] args) {
		
		// basinda Hash ibaresi gecen veri yapilarinda hashCode ve equals metotlari override edilmelidir.
		
		Set<Person3> personList = new HashSet<>();

		Person3 p1 = new Person3("testname", "testsurname");

		Person3 p2 = new Person3("testname", "testsurname");

		personList.add(p1);

		personList.add(p2);

		System.out.println(personList.size()); // 2 yazar. Cunku equals ve hashcode metodu yoktur!
		// ikisinin ayni oldugunu anlamasi icin equals ve hashcode metotlarini override
		// etmeliyiz.
		
		// hashcode ve equals override edildikten sonra
		
		System.out.println(personList.size()); // 1 yazar
		
		System.out.println(personList.contains(new Person3("testname", "testsurname")));
		// farkli bir obje olusturulmasina ragmen set'in icinde oldugu icin geriye true donmektedir.
	}

}

class Person3 {

	private String name;
	private String surname;

	public Person3(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Person3 other = (Person3) obj;
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