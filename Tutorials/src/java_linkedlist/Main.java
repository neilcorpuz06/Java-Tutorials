package java_linkedlist;

//Import the LinkedList class
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
	}
}

/*
 * Note: When To Use Use an ArrayList for storing and accessing data, and
 * LinkedList to manipulate data.
 */