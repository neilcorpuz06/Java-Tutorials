package java_linkedlist;

//Import the LinkedList class
import java.util.LinkedList;

public class LinkedList_RemoveFirst_Method {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Use removeFirst() remove the first item from the list
		cars.removeFirst();
		System.out.println(cars);
	}
}
