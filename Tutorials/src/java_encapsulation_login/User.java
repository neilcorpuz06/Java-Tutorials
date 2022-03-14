package java_encapsulation_login;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
     
	 Scanner console = new Scanner(System.in);
	 String userName, firstName, lastName, userpassword, userConPassword;
	 
	 Login log = new Login();
	 
	 System.out.print("Username: ");
	 userName = console.nextLine();
	 log.setUsername(userName);
	 
	 System.out.print("First name: ");
	 firstName = console.nextLine();
	 log.setFirstName(firstName);
	 
	 System.out.print("Last name: ");
	 lastName = console.nextLine();
	 log.setLastName(lastName);
	 
	 System.out.print("Password: ");
	 userpassword = console.nextLine();
	 log.setPassword(userpassword);
	 
	 System.out.print("Confirm password: ");
	 userConPassword = console.nextLine();
	 log.setConfirmPassword(userConPassword);
	 
	 
	 log.getUsername();
	 log.getFirstName();
	 log.getLastName();
	 log.getPassword();
	 log.getConfirmPassword();
	 
	 console.close();

	}

}
