package java_hashmap;

//Import the HashMap class
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// Create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		/* System.out.println(capitalCities); */
		System.out.println(capitalCities.size()); //output is 4
		
		/* Access an Item */
		/* System.out.println(capitalCities.get("England")); */
		/* the output will be London */
		
		/* Remove an Item */
		/*
		 * capitalCities.remove("England"); System.out.println(capitalCities);
		 * the output will be {USA=Washington DC, Norway=Oslo, Germany=Berlin}
		 */
		
		/* Clear Method */
		/* capitalCities.clear(); */
		/* System.out.println("Capital Cities was clear: "+capitalCities); */
		
		// Print keys
		System.out.println("PRINT  KEYS");
		for (String i : capitalCities.keySet()) {
		  System.out.println(i);
		}
		
		System.out.println("\n");
		
		System.out.println("PRINT VALUES");
		// Print values
		for (String i : capitalCities.values()) {
		  System.out.println(i);
		}
	}
}
