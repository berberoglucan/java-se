package _37.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest01 {
	
	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<>();
		
		nameList.add("can");
		
		nameList.add("kemal");
		
		nameList.add("cem");
		
		nameList.set(0, "can berberoglu"); // ilgili indexteki elemanin degerini degistirir.
		
		for (String string : nameList) {
			System.out.println(string);
		}
		
		System.out.println(nameList.get(1));  // indexdeki elemani doner
		
		System.out.println(nameList.isEmpty());
		
		System.out.println(nameList.size());
		
		System.out.println(nameList.contains("can berberoglu")); // true
		
		nameList.remove("can berberoglu");
		
		for (String string : nameList) {
			System.out.println(string);
		}
		
		nameList.add(0, "can berberoglu");
		
		for (String string : nameList) {
			System.out.println(string);
		}
		
		List<String> codeToInterface = new ArrayList<>();
		
		codeToInterface = new LinkedList<>();
		
	}
	
	
	
}
