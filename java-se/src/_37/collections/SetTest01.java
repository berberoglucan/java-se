package _37.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
	
	public static void main(String[] args) {
		
		// duplicate elemana izin verilmez!!!
		
		// hashSet
		
		Set<Integer> numbers = new HashSet<>();
		
		System.out.println(numbers.isEmpty()); // true
		
		numbers.add(10);
		
		numbers.add(10); // set icerisine eklemez
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		
		numbers.add(20);
		
		
		System.out.println(numbers.size()); // 2 
	
		for (Integer integer : numbers) {
			System.out.println(integer); // cikti onceden tahmin edilemez.
		}
		
		
		numbers.add(50);
		
		numbers.add(60);
		
		for (Integer integer : numbers) {
			System.out.println(integer); // cikti onceden tahmin edilemez.
		}
		
	}
	
}
