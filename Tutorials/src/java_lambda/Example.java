package java_lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

/*Use Java's Consumer interface to store a lambda expression in a variable:*/
public class Example {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		Consumer<Integer> method = (n) -> {
			System.out.println(n);
		};
		numbers.forEach(method);
	}
}
