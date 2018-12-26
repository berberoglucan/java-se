package _30.io;

import java.io.File;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args) throws IOException {

		File testDir = new File("testDir");

		testDir.mkdir();
		
		File subDir = new File(testDir, "subDir");

		subDir.mkdir();

		File file1 = new File(testDir, "test1.text");

		file1.createNewFile();

		File file2 = new File(testDir, "test2.text");

		file2.createNewFile();

		File file3 = new File(testDir, "test3.text");

		file3.createNewFile();

		File file4 = new File(testDir, "test4.text");

		file4.createNewFile();
		
		String[] listName = testDir.list(); // directory altindaki tum dosya isimlerini doner
		
		for (String string : listName) {
			System.out.println(string);
		}
		
		File[] files = testDir.listFiles(); // file objelerini doner
		
		for (File file : files) {
			if(file.isFile()) {
				System.out.println("file name : " + file.getName() + " " + file.getAbsolutePath() ); // absolute name tam adresini verir
				
			} else {
				System.out.println("directory name : " + file.getName() + " " + file.getPath());
			}
		}

	}

}
