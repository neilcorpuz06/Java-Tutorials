package java_arraylist;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		/* System.out.println(cars); */
	
		/* System.out.println(cars.get(0)); */
		
		cars.set(0, "Opel"); // the value of index 0 will override
		/* System.out.println(cars.get(0)); */
		
		cars.remove(0);//will remove. instead of Opel that alter the Volvo value it will be display BMW.
		/* System.out.println(cars.get(0)); */
		
		cars.size();
		System.out.println(cars.size());//because we reomove the value of index 0 it wll be 3.
		
		cars.clear();
		System.out.println("The value of car arraylist is: " +cars);
	}
}
