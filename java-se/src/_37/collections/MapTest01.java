package _37.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {

	public static void main(String[] args) {
		
		// Map -> key unique, value duplicate olabilir.
		
		Map<Integer, String> myMap = new HashMap<>();
		
		myMap.put(10, "value");
		
		myMap.put(10, "value_override");
		
		myMap.put(100, "value2");
		
		System.out.println(myMap.isEmpty());
		
		System.out.println(myMap.containsKey(10));
		
		System.out.println(myMap.containsValue("value2"));
		
		
		System.out.println(myMap.size());
		
		System.out.println(myMap.get(10));
		
		System.out.println(myMap);
		
		myMap.remove(10);
		
		System.out.println(myMap);
		
		myMap.clear();
		
	}
	
}



