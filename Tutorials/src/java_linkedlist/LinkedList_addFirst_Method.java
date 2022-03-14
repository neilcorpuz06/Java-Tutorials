package java_linkedlist;

//Import the LinkedList class
import java.util.LinkedList;

public class LinkedList_addFirst_Method {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");

		// Use addFirst() to add the item to the beginning
		cars.addFirst("Mazda");
		System.out.println(cars);
	}
}
