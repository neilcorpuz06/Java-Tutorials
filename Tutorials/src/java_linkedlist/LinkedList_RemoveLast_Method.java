package java_linkedlist;

//Import the LinkedList class
import java.util.LinkedList;
public class LinkedList_RemoveLast_Method {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Use removeFirst() remove the first item from the list
		cars.removeLast();
		System.out.println(cars);
	}
}
