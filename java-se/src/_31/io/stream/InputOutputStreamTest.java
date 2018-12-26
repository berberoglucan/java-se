package _31.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamTest {

	public static void main(String[] args) throws IOException {
		
		// FileOutputStream -> dosyaya byte olarak yazar
		
		FileOutputStream fos = new FileOutputStream("stream.txt");
		
		byte[] bytes = "james gosling".getBytes();
		
		fos.write(bytes);
		
		
		fos.close();
		
		// FileInputStream -> byte olarak okumak icin kullanilir.
		
		FileInputStream fis = new FileInputStream("stream.txt");
		
		int i = 0, available = 0;
		
		while ((i = fis.read()) != -1) {
			char c = (char) i;
			available = fis.available();
			System.out.print(c);
			
		}
		
		fis.close();
	}
	
}

// InputStream / OutputStream -> byte oriented
// Writer / Reader -> character oriented