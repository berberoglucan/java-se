package _41.threads;

public class CreateThreadTest {

	public static void main(String[] args) {

		System.out.println("main..");
		System.out.println(Thread.currentThread());

		MyThread thread1 = new MyThread(); // yeni bir thread objesi olusturduk.

		// thread'i baslatabilmek icin start metodunu cagirmaliyiz.

		thread1.start(); // yeni bir thread olusturur

		// bir thread'i iki kere start yapamayiz. runtime'da hata aliriz.

		// thread1.start(); // java.lang.IllegalThreadStateException

		// thread1.run(); // run metodunu cagirdigmizda yeni bir thread olusmaz. main thread'i iceriside
						// calisir.

		
		
		// runnable interface'i
		
		MyRunnable runnable = new MyRunnable();
		// runnable.run(); // bu islem yeni bir thread baslatmaz! yine main thread'i icerisinde calisir.
		
		Thread thread2 = new Thread(runnable);
		thread2.start();
		
	}

}

// 1) java.lang Thread sinifi kalit
// 2) run metodunu override et

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("MyThread#run");
		System.out.println(Thread.currentThread());
	}

}

// 1) Runnable interface'ini implements et
// 2) run metodunu override et
class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("MyThread#run");
		System.out.println(Thread.currentThread());
	}

}