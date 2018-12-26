package _41.threads;

public class RaceCondition {

	public static void main(String[] args) {

		Counter runnable = new Counter();

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);

		t1.start();
		t2.start();
		t3.start();
		
	}

}

class Counter implements Runnable {

	int c = 0;

	@Override
	public void run() {
		increment();
		increment();
		increment();
		increment();
	}

	public void increment() {
		this.c++;
		System.out.println(this.c + " : " + Thread.currentThread().getName());
	}

}

// atomic -> bolunmeyen islem

// counter++; // -> statement

// 1) counter degeri okunur.
// 2) counter degeri bir arttirilir.
// 3) counter degeri guncellenir./yazilir.

// T1 threadi calistiginda, bu uc adimindan tek seferde calisacaginin bir garantisi yoktur.
// ornegin adim1, adim2 calisir sonrasinda durabilir, bir baska thread calistiktan sonra tekrar calisabilir.

/*
 * class Counter { private long count = 0;
 * 
 * public void add(long value) { this.count = this.count + value; } }
 */

// yukaridaki koda ornek olarak
// 2 tane thread olsun T1 ve T2
// T1 geldi, hafizadan count degerini okudu (0)
// T2 geldi, hafizadan count degerini okudu (0)
// T1 calismaya devam etsin, value 2 olsun, 2 degerini ekler. sonrasinda kaydeder ve this.count = 2 oldu.
// T2 calismaya devam etsin, value 3 olsun. T2 bu degeri 0 olarak almisti. toplama islemini yapacak ve this.count = 3 olacaktir.
// Burada güncel deger 5 olmasi gerekirken, count degeri 3 oldu. 

// race condition -> Birden fazla thread ayni kaynaga erisip bu kaynagi degistirmek istediginde race condition durumu ortaya cikar.
// bu durum genellikle instance degiskenler uzerinde olusur.

