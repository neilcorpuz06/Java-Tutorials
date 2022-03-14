package java_inheritance_employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      
		Scanner console = new Scanner(System.in);
		
		String firstName, lastName, job_title, emp_address,emp_gender;
		int emp_age;
       	
		System.out.print("Employees First Name :");
		firstName = console.nextLine();
		
		System.out.print("Employees Last Name :");
		lastName = console.nextLine();
		
		System.out.print("Employees Job Title :");
		job_title = console.nextLine();
		
		System.out.print("Employees Adress :");
		emp_address = console.nextLine();
		
		System.out.print("Employees Gender :");
		emp_gender = console.next();
		
		System.out.println("Employees Age :");
		emp_age = console.nextInt();
		
		
		Employee employee = new Employee(firstName,
				lastName,
				job_title,
				emp_address,
				emp_gender,
				emp_age);
		
		
        Employee.greetings();
		employee.showDetails();
		
		console.close();
	}

}
