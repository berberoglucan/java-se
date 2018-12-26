package _37.collections;

import java.util.ArrayList;
import java.util.List;


public class ListTest03 {

	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList<>();
		
		numberList.add(20);
		
		numberList.add(10);
		
		numberList.add(50);
		
		numberList.add(80);
		
		List<Integer> numberListNegative = new ArrayList<>();
		
		numberListNegative.add(-101);
		
		numberListNegative.add(-54);
		
		numberListNegative.add(-43);
		
		numberList.addAll(numberListNegative); // negatif listeyi digerinin sonuna ekledi
		
		for (Integer integer : numberList) {
			System.out.println(integer);
		}
		
		numberList.removeAll(numberListNegative); 
		
		System.out.println("after remove");
		
		for (Integer integer : numberList) {
			System.out.println(integer);
		}
		
		List<Integer> retainList = new ArrayList<>();
		
		retainList.add(10);
		
		retainList.add(50);
		
		retainList.add(250);
		
		retainList.add(300);
		
		numberList.retainAll(retainList); // kesişimini alır.
		
		System.out.println(numberList); // geriye 10 50 elemanlari kaldi.
		
	}

}




































