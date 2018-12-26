package _28.checked.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		
		try {
			FileWriter fileWriter = new FileWriter("file.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}

// bir checked exception firlatma riski olan metodu kullandigimizda handle or declera kuralýna uymaliyiz.


// ya metot tanimina throws anahtar kelimesi ile bu riski aldigimizi belirticez/declare
// ya da try-catch arasina alicaz. /handle