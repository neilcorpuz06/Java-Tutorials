package student_object_methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String firstName, lastName, scourse, ssection;
		int schoolYear;
		float midtermGrade, finalGrade;
		
		
		System.out.print("Enter Student First Name: ");
		firstName = input.nextLine();
		
		System.out.print("Enter Student Last Name: ");
		lastName = input.nextLine();
		
		System.out.print("Enter Student Course: ");
		scourse = input.nextLine();
		
		System.out.print("Enter Student Section: ");
		ssection = input.nextLine();
		
		System.out.print("Enter Student School Year: ");
		schoolYear = input.nextInt();
		
		System.out.print("Enter Student Midterm Grade: ");
		midtermGrade = input.nextFloat();

		System.out.print("Enter Student Final Grade: ");
		finalGrade = input.nextFloat();
		
		
		
		Students student01 = new Students(firstName,lastName,scourse,ssection,schoolYear,midtermGrade,finalGrade);
		
		System.out.println("\n\n");
		
		//Getting the method in Student Class.
		student01.introduceSelf();
		student01.evaluateGrade();
		
		
       input.close();
	}

}
