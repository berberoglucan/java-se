package _37.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetTest03 {

	public static void main(String[] args) {

		// TreeSet -> kullanilmasi icin Comparable olmali

		Set<Integer> numbers = new TreeSet<>();

		numbers.add(-1);
		numbers.add(10);
		numbers.add(-100);
		numbers.add(59);
		numbers.add(43);
		numbers.add(1000);
		numbers.add(20);
		numbers.add(41);
		numbers.add(3);
		numbers.add(9);

		for (Integer integer : numbers) {
			System.out.println(integer);
		}

		Set<Car> cars = new TreeSet<>();

		// cars.add(new Car()); // _37.collections.Car cannot be cast to
		// java.lang.Comparable

	}

}

class Car {

}
