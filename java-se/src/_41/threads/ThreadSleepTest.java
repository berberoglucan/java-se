package _41.threads;

public class ThreadSleepTest {

	public static void main(String[] args) {

		Runnable runnable = new ThreadSleep();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		Thread thread4 = new Thread(runnable);

		thread1.setName("thread1");
		thread2.setName("thread2");
		thread3.setName("thread3");
		thread4.setName("thread4");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}

class ThreadSleep implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread name : " + Thread.currentThread().getName() + " : " + i);

			try {
				Thread.sleep(1000); // ilgili calisan thread'i 1 saniye bekletir.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

// public static native void sleep(long millis) throws InterruptedException;
// public static void sleep(long millis, int nanos) throws InterruptedException {

// slepp metodu static bir metot
// InterruptedException bir checked exception'dir

// Thread sleep metodu verilen bir sure kadar ilgili thread'i uyutur.(TIMED_WAITING)
// belirtilen sure bittignde thread o anda calismaya devam etmez. Bunun bir garantisi yok.
// TIMED_WAITING -> RUNNABLE gecer.
// thread scheduler ilgili thread'i tekrar secer ve calistirir.

// Thread.yield(); metodu running state'de olan bir thread'in runnable duruma gecmesi icin kullanilir. Yani thread'i geri cekme tavsiyesinde bulunuruz.
// ama bunun bir garantisi yoktur.