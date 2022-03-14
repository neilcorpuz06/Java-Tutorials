package java_hashset;

//Import the HashSet class
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		/* System.out.println(cars); */
		System.out.println(cars.size());

		/* System.out.println(cars.contains("Mazda")); */ // boolean output will be true.

		/* Remove value from HashSet. */
		/* cars.remove("Volvo"); */
		/* System.out.println(cars); */

		/* Loop the HashSet */
		for (String i : cars) {
			System.out.println(i);
		}
        
		cars.clear();
		System.out.println("\nafter the clear method the value of HashSet is: " +cars);
	}
}
