package _41.threads;

public class ThreadInteracion {

	public static void main(String[] args) {

		Calculate calculateThread = new Calculate();

		calculateThread.start();
		
		// wait - notify - notifyAll metotlari synchronized block'ta olmalidir.
		// IllegalMonitorException hatasþ aliriz.

		synchronized (calculateThread) {
			
			try {
				System.out.println("Waiting for calculateThread to complete");
				calculateThread.wait(); // objenin lock'ý bekletir.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("total : " + calculateThread.total);

			System.out.println("counter : " + calculateThread.counter);
			
		}

		

	}

}

class Calculate2 extends Thread {

	int total;
	int counter;

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 0; i < 100000; i++) {
				total += i;
				counter = i;
			}

			notify(); // islem tamamlandiktan sonra notify yolluyoruz.
		}

	}

}