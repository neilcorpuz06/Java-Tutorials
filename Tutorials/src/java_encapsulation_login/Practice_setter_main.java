package java_encapsulation_login;

import java.util.Scanner;

public class Practice_setter_main {

	public static void main(String[] args) {
		
		// Scanner object
		Scanner console = new Scanner(System.in);
		
		// User input to get the new value that will pass in super class
		System.out.print("Enter Name: ");
		String newname = console.nextLine();

		Practice_setter_sup s = new Practice_setter_sup(newname);
		s.showDetails(); // from new declare object + method from super class

		console.close(); // close the scanner input
	}

}
