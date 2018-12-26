package _15.returnTypes;

import java.io.Serializable;

public class ReturnTypes {

	// 1 - bir metodun donus tipi reference type ise geriye null donebilir.
	public String checkNull() {
		return null;
	}

	public int[] checkNull2() {
		return null;
	}

	public Integer checkNull3() {
		return null;
	}

	// 2- Her metodun donus tipi olmak zorunda degildir. Bunun icin void
	// kullanilabilir.

	public void voidReturnType() {
		// return 10; // derleme hatasi
		return; // kullanilabilir
	}

	// 3- primitive bir donus tipli metot icin, donus tipi otomatik olarak
	// implicityly donusebilecek bir deger varsa burada acik bir sekilde casting
	// yapmadan tanimlama yapilabilir.

	public double getSalary() {
		return 100; // donus tipi double ama geriye int donuyoruz. Casting islemi implicitly olarak
					// yapilir.
	}
	
	// 4 - veri kaybi riski varsa acik bir sekilde casting islemi gereklidir.
	
	public int getIntSalary() {
		return (int) 100.5;
	}
	
	// 5 - IS-A iliþkisi olan classlarda  geriye subclass donebiliriz.
	
	public Object getObject() {
		// String IS-A Object
		return new String[] {"can", "cem"};
	}
	
	// 6 - donus tipi interface olabilir ve geriye interface'yi implements eden sinifi donebiliriz
	
	public Serializable get() {
		// String IS-A Serializable
		return new String[] {"a", "b"};
	}
}
