package java_methods_practice;

import java.util.Scanner;

public class Practice_With_Print_Method {

	//Print Method
	static void print(String word) {
		System.out.print(word);	
	}
	static void printLine(String word) {
	   System.out.println(word);	
	}
	
	//Main Method
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		print("Enter your firstname: ");
		String name = console.nextLine();
		
		print("Yourname is " +name);
		 
		console.close();
	}

}
