package _37.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest02 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, null); // legal
		
		hashMap.put(null, null); // legal
		
		Map<Integer, String> hashTable = new Hashtable<>();
		
		// hashTable.put(1, null); // NullPointerException
		
		// hashtable'da key ve ya value null olamaz
		// metotlar synchronized (thread safe ozellik gosterir)
		
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		// elemanlar eklendigi sirada tutulur.
		linkedHashMap.put(1, "value1");
		
		linkedHashMap.put(2, "value2");
		
		linkedHashMap.put(3, "value3");
		
		linkedHashMap.put(4, "value4");
		
		linkedHashMap.put(5, "value5");
		
		System.out.println(linkedHashMap);
		
		
	}
	
}
