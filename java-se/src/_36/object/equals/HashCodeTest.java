package _36.object.equals;

public class HashCodeTest {

	public static void main(String[] args) {
		
		
		
	}
	
}

// Object icinde yer alan bir native metottur. JVM bunu arka planda implement eder.

// hashcode degerini bir nevi objenin id degeri gibi dusunebiliriz.
// hashcode degerleri HashMap, Hashtable, HashSet gibi Collection veri yapilari icin onem arz eder.
// objelerin saklanmasi ve getirilmesi noktasinda hashcode kullanilmalidir.

// hashing icin

// 1 - hashCode() metodu ile ilgili sepet bulunur.
// 2 - equals() metodu ile sepet icerisindeki deger aranýr.