package java_lambda;

import java.util.ArrayList;

/*Use a lamba expression in the ArrayList's forEach() method to print every item in the list:*/

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		numbers.forEach((n) -> {
			System.out.println(n);
		});
	}
}
