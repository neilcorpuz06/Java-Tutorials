package java_methods_callByReference;

public class CallByReference {

	int a, b; //Global Variable

	// Function to assign the value
	// to the class variables
	CallByReference(int x, int y) {//Constructor.
		a = x;
		b = y;
	}

	// Changing the values of class variables
	void ChangeValue(CallByReference obj) {
		obj.a += 10;
		obj.b += 20;
	}

	public static void main(String[] args) {
		// Instance of class is created
		// and value is assigned using constructor
		CallByReference object = new CallByReference(10, 20);

		System.out.println("Value of a: " + object.a + " & b: " + object.b);

		// Changing values in class function
		object.ChangeValue(object);

		// Displaying values
		// after calling the function
		System.out.println("Value of a: " + object.a + " & b: " + object.b);
	}

}
