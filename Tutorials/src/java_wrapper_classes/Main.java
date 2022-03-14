package java_wrapper_classes;

public class Main {

	public static void main(String[] args) {
		
		/* Wrapper objects example.*/
	    Integer myInt = 5;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
	    System.out.println(myInt);
	    System.out.println(myDouble);
	    System.out.println(myChar);
	  }
}

/*
 * Note:ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
 * ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
 * 
 * Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
 */