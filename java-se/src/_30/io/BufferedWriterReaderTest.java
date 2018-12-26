package _30.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReaderTest {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("buffered.txt");
		
		// satir satir yazmak icin buffered writer kullanilabilir.
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("line1");
		bw.write("\n");
		bw.write("line2");
		bw.write("\n");
		bw.write("line3");
		
		bw.flush();
		
		bw.close();
		
		// BufferedReader -> satir satir okumak icin kullanilir.
		
		FileReader fr = new FileReader("buffered.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String content = null;
		
		while ((content = br.readLine() ) != null) {
			System.out.println(content);
		}
		
		br.close();
		
	}
	
}
