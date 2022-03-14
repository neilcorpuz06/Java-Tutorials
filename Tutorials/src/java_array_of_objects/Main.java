package java_array_of_objects;

import java.util.Scanner;

import display.Display;

public class Main {

	/* Driver method or Main method. */
	public static void main(String[] args) {

		// Craeting an array object
		Employee employees[] = new Employee[2];



		// Scanner object. Scanner console = new Scanner(System.in); String fname,
		Scanner console = new Scanner(System.in);
		String fname, lname, title;

		for (int i = 0; i < employees.length; i++) {
			Display.printLine("");
			Display.print("Enter first name: ");
			fname = console.nextLine();
			Display.print("Enter last name: ");
			lname = console.nextLine();
			Display.print("Enter job title: ");
			title = console.nextLine();
			
			employees[i]  = new  Employee(fname,lname,title);
		}
		
		for(int i = 0; i<employees.length;i++ ) {
			Display.printLine("");
			employees[i].introduceSelf();
		}
      console.close();
	}

}
