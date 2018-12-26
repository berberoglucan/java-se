package _30.io;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

		File file = new File("test.txt"); // suan harddisk'te test.txt dosyasi olusmaz. Sadece bellekte olusur.
		
		System.out.println(file.exists()); // false
		
		try {
			file.createNewFile(); // dosya olustu.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// dizin olusturma
		
		File directory = new File("myDir");
		
		directory.mkdir();
		
		// dizin icinde dosya olusturma
		
		File file2 = new File(directory ,"file.txt");
		
		file2.createNewFile();
		
		System.out.println(directory.isDirectory());
		
		System.out.println(file2.isFile());
		
		directory.delete(); // dizin ici doluyken silmez
		
		file2.delete(); // dosyayi siler
		
	}

}

// java.io.File
// File sinifi dosyaya veri yazmak ve ya veri okumak icin kullanilmaz.
// File sinifi dosya/file, folder/dizin gostermek, olusturmak, isimlendirmek, silmek vs. gibi amaclar icin kullanilir.