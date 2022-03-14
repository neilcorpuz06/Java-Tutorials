package java_abstract_of_objects_practice;

import java.util.Scanner;
import display.Display;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		String fname, lname, course, section;
		int year, range;

		Display.print("Enter number of student in the class: ");
		range = console.nextInt();
		console.nextLine();//to avoid error.

		Student student[] = new Student[range];

		for (int i = 0; i < student.length; i++) {
			Display.printLine("Student No."+(i+1));
			Display.print("First name  :");
			fname = console.nextLine();	
			Display.print("Last name   :");
			lname = console.nextLine();
			Display.print("Course      :");
			course = console.nextLine();
			Display.print("Section     :");
			section = console.nextLine();
			Display.print("School Year :");
		    year = console.nextInt();
		    console.nextLine();//to avoid error.
		    
		    student[i] = new Student(fname,lname,course,section,year);
		    Display.printLine("");
		}
		for(Student x:student) {
			x.introduceSelf();
		}

		console.close();
	}
}
