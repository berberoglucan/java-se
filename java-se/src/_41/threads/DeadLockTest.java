package _41.threads;

public class DeadLockTest {

	public static Object LockA = new Object();
	public static Object LockB = new Object();

	public static void main(String[] args) {

		ThreadDemo1 thread1 = new ThreadDemo1();
		ThreadDemo2 thread2 = new ThreadDemo2();

		thread1.start();
		thread2.start();

	}

	private static class ThreadDemo1 extends Thread {

		@Override
		public void run() {

			synchronized (LockA) {
				System.out.println("Thread 1 : Holding lock A...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Thread 1 : Waiting for Lock B..");
				synchronized (LockB) {
					System.out.println("Thread 1 : Holding LockA & LockB");
				}
			}

		}

	}

	private static class ThreadDemo2 extends Thread {

		@Override
		public void run() {

			synchronized (LockB) {
				System.out.println("Thread 2 : Holding lock B...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Thread 2 : Waiting for Lock A..");
				synchronized (LockA) {
					System.out.println("Thread 1 : Holding LockA & LockB");
				}
			}

		}

	}

}

// deadlock -> 2 veya daha fazla threadin birbirini blocklamasi durumudur.
// deadlock'tan kacinmak icin locklar'in alinma sirari aynı yapılabilir