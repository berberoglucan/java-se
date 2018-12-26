package _41.threads;

public class WithoutThreadInteracion {

	public static void main(String[] args) {

		Calculate calculateThread = new Calculate();

		calculateThread.start();

		System.out.println("After calculate..");
		
		// race condition
		
		System.out.println("total : " + calculateThread.total);

		System.out.println("counter : " + calculateThread.counter);

	}

}

class Calculate extends Thread {

	int total;
	int counter;

	@Override
	public void run() {

		for (int i = 0; i < 100000; i++) {
			total += i;
			counter = i;
		}

		System.out.println(total);
		System.out.println(counter);

	}

}