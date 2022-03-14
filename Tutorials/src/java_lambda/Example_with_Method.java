package java_lambda;

interface StringFunction {
	String run(String str);
}

/* Create a method which takes a lambda expression as a parameter: */

public class Example_with_Method {
	public static void main(String[] args) {
		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);
	}

	public static void printFormatted(String str, StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}
}
