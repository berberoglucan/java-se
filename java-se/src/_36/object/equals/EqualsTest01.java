package _36.object.equals;

public class EqualsTest01 {

	public static void main(String[] args) {

		// == kontrolu, referans type degiskenler icin bu iki referans degisken ayni
		// objeyi mi gosteriyor? anlamina gelir.
		// varsayilan olarak da equals ile == ayni sekilde calismaktadir.
		
		
		Integer number1 = new Integer(100);
		Integer number2 = new Integer(100);
		
		System.out.println(number1 == number2); // false
		
		// numerik degerler kontrol edilir
		System.out.println(number1.equals(number2)); // true
		

	}

}
