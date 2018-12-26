package _32.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	// transient olan degisken dosyaya yazilmaz. by-pass edilir 
	private transient String surname;

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

	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + "]";
	}

}

public class SerializableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Person person = new Person("can", "berberoglu");

		// objeyi dosyaya yaziyoruz.
		FileOutputStream fos = new FileOutputStream("person.serial");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(person);

		oos.close();

		// dosyadan objeyi okuma

		FileInputStream fis = new FileInputStream("person.serial");

		ObjectInputStream ois = new ObjectInputStream(fis);

		person = (Person) ois.readObject();

		System.out.println(person);

		ois.close();

	}

}

// Serializable -> objeyi instance degiskenler ile kaydetme
