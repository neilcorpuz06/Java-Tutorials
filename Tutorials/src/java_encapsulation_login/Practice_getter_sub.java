package java_encapsulation_login;

import java.util.Scanner;

public class Practice_getter_sub {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		// user input to pass a data to an object to super class
		System.out.print("Enter new Number: ");
		int a = console.nextInt();

		Practice_getter_sup p = new Practice_getter_sup(a);
		// Using Getter i get the data from super class to sub class and print it
		System.out.print("The User id is: " + p.getUserID());

		console.close();
	}

}
