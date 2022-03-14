package java_threads;


/*Note: Use isAlive() to prevent concurrency problems*/

public class Concurrency_Problems_Solution extends Thread {
	public static int amount = 0;

	public static void main(String[] args) {
		Main thread = new Main();
		thread.start();
		// Wait for the thread to finish
		while (thread.isAlive()) {
			System.out.println("Waiting...");
		}
		// Update amount and print its value
		System.out.println("Main: " + amount);
		amount++;
		System.out.println("Main: " + amount);
	}

	public void run() {
		amount++;
	}
}
