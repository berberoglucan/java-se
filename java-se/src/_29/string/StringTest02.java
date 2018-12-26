package _29.string;

public class StringTest02 {

	public static void main(String[] args) {
		
		String name = "can"; // string pool'da "can" olustu.
		
		name.concat(" berberoglu"); // once "berberoglu" olusur.
		
		// daha sonra pool'da "can berberoglu" olusur.
		// yani string pool'da 3 adet obje olusur.
		
		System.out.println(name); // can yazar. diger 2 obje cop hukmundedir.
		
		String name2 = "james"; // pool'da "james" olusur.
		name2 = name2.concat("gosling"); // pool'da gosling olusur. daha sonra "james gosling" olusur.
		
		System.out.println(name2); // james gosling -> diger "james" ve "gosling" cop hukmundedir.
		
		
 		
	}
	
}
