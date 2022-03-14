package java_methods_overloading;

//Java Program to Illustrate Method Overloading

//By Changing Data Types of the Parameters

public class Addition_Method2 {
	// Method 2: By changing the Data types of the parameters
	// Adding three integer values
	public int add(int a, int b, int c) {

		int sum = a + b + c;
		return sum;
	}

	// adding three double values.
	public double add(double a, double b, double c) {

		double sum = a + b + c;
		return sum;
	}
}
