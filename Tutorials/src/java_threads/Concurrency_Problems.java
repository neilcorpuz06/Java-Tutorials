package java_threads;

public class Concurrency_Problems extends Thread {
	public static int amount = 0;

	  public static void main(String[] args) {
	    Main thread = new Main();
	    thread.start();
	    System.out.println(amount);
	    amount++;
	    System.out.println(amount);
	  }

	  public void run() {
	    amount++;
	  }
}

/* CONCURRENCY PROBLEMS.
 * Note: Because threads run at the same time as other parts of the program,
 * there is no way to know in which order the code will run. When the threads
 * and main program are reading and writing the same variables, the values are
 * unpredictable. The problems that result from this are called concurrency
 * problems.
 */