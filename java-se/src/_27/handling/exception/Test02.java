package _27.handling.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {

		// subclass olan hata/exception yukarida/once olmalidir.
		// aksi durumda compiler error aliriz.

		// hiyerarsiden bagimsiz bir exception varsa nerede oldugu onemli degildir.

		try {
			FileReader fr = new FileReader("can.txt");
			fr.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (NullPointerException e) {

		} catch (Exception e) {
		}

	}

}
