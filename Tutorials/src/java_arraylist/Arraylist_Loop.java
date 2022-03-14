package java_arraylist;

import java.util.ArrayList;

public class Arraylist_Loop {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		/*
		 * using for loop. 
		 * for (int i = 0; i < cars.size(); i++) {
		 * System.out.println(cars.get(i)); }
		 */
		/* using for each loop. */
		for (String i : cars) {
			System.out.println(i);
		}
	}

}
