package _37.collections;

import java.util.Arrays;
import java.util.List;

public class ListTest02 {
	
	public static void main(String[] args) {
		
		String[] names = {"name1", "name2", "name3"};
		
		List<String> testList = Arrays.asList(names); // array'deki elemanda guncellenir.
		
		testList.set(1, "newName2");
		
		for (String string : names) {
			System.out.println(string);
		}
		
		// testList.remove(1); / java.lang.UnsupportedOperationException
		
	}
	
}
