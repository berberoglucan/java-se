package _38.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingTest01 {
	
	public static void main(String[] args) {
	
		Integer[] numbers = {20, 50, 1, -10, -5, 50, 60, 3, 7};
		
		Arrays.sort(numbers);
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		
		String[] names = {"can", "kemal", "cem", "suleyman", "kadir"};
		
		Arrays.sort(names);
		
		for (String string : names) {
			System.out.println(string);
		}
		
		// collection sort
		
		List<Integer> list = new ArrayList<>();
		
		list.add(20);
		
		list.add(60);
		
		list.add(50);
		
		list.add(-1);
		
		list.add(10);
		
		Collections.sort(list);
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
	}
	
}
