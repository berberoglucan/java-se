package _30.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("fileWriter.txt"); // dosya olusur
		
		fw.write("james gosling");
		
		fw.flush();
		
		fw.close();
		
		// FileReader ile dosya okuma
		
		// character oriented olarak okur (karakter karakter)
		
		FileReader fr = new FileReader("fileWriter.txt");
		
		char[] input = new char[100];
		
		int size = fr.read(input);
		
		System.out.println(size);
		
		for (char c : input) {
			System.out.print(c);
		}
		
		fr.close();
		
	}
	
}
