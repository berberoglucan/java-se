package _29.string;

public class StringBufferAndBuilder {

	public static void main(String[] args) {

		// String icin

		String str1 = "test";
		str1.concat(" suffix");

		System.out.println(str1); // test

		// StringBuffer icin

		StringBuffer sb = new StringBuffer("test");
		sb.append(" suffix"); // mutable oldugu icin objenin kendisi degisir.

		System.out.println(sb); // test suffix

		// StringBuilder

		StringBuilder sb2 = new StringBuilder("james gosling");

		sb2.delete(6, 8);

		System.out.println(sb2);

		sb2.insert(3, "INSERTED");

		System.out.println(sb2);

		sb2.reverse();

		System.out.println(sb2);

		// StringBuffer metotlari sycnhronized ozellik gösterir. Yani thread safe!
		// StringBuilder metotlari synchronized degildir. Bu yuzden daha hizli calisir.

	}

}

// String objeleri immutable ozellik gosterir. 
// Cok fazla degisiklik yapildiginda StringBuffer ya da StringBuilder objelerini kullanmak uygun olacaktir. 
// Bu objeler mutable ozellige sahiptir.