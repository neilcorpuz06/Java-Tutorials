package java_methods_overloading;

//Java Program to Illustrate Method Overloading

//By Changing the Number of Parameters

public class Addition_Method1 {
	// Method 1: By changing the number of parameters.
	// Adding two integer values
	public int add(int a, int b) {

		int sum = a + b;
		return sum;
	}

	// Method 2
	// Adding three integer values
	public int add(int a, int b, int c) {

		int sum = a + b + c;
		return sum;
	}
}
