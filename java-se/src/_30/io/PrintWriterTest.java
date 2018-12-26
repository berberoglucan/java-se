package _30.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterTest {
	
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("printWriter.txt");
		pw.write("line1\n");
		pw.write("line2\n");
		pw.write("line3\n");
		pw.close();
		
		// dosyaya yazmak icin kolaylik saglar.
	}
	
}
