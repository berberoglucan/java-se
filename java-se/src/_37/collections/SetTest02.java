package _37.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest02 {
	
	public static void main(String[] args) {
		
		// LinkedHashSet kullanildiginda elemanlar eklenilen sirada tutulur.
		
		Set<Integer> sets = new LinkedHashSet<>();
		
		sets.add(10);
		
		sets.add(20);
		
		sets.add(30);
		
		for (Integer integer : sets) {
			System.out.println(integer);
		}
		
	}
	
}
