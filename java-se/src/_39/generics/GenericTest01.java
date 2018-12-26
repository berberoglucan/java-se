package _39.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericTest01 {

	public static void main(String[] args) {

		// generic yapisi

		// 1) derleme zamaninda tip kontrolu/ type check saglar.
		// 2) cast etme islemini ortadan kaldirir ve runtime da exception almamizi
		// engeller.
		
		List<Integer> numberList = new ArrayList<>();
		
		// public interface List<E> extends Collection<E> --> E -> Integer
		
		numberList.add(100);
		// boolean add(E e); -> Integer alir
		
		Integer i = numberList.get(0); // cast etme islemini ortadan kaldirdi.
		// E get(int index); -> geriye Integer doner.
		
		// generic yapisi sadece compile time'da calismaktadir.
		// runtime'da generic yapisi silinir. Boylece ilgili yapi runtime'da nonGeneric hale gelir.
		
	}

}
