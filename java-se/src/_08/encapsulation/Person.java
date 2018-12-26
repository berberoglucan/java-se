package _08.encapsulation;

// encapsulation icin

// 1- instance variable'lar private olarak tanýmlanmali

// 2- Bunlara eriþim public getter/setter metotlar ile saglanacak

// 3 - public getter/setter metotlarin isimleri standarta uygun olmalidir

public class Person {

	private String name;

	private String surname;

	private int age;

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

}
