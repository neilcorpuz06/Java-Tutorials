package java_encapsulation;

import java.util.Scanner;

public class Practice_Main {

	public static void main(String[] args) {
		Practice_Second myObj =  new Practice_Second();
		Scanner console = new Scanner(System.in);
		String new_name;
		
		System.out.print("Enter name: ");
		new_name = console.nextLine();
	    myObj.setName(new_name);
		myObj.showDetails();
		
		console.close();
	}

}
