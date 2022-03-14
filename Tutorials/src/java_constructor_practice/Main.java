package java_constructor_practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
       String choice;
       
       System.out.print("Type your favorite motorcycle brand: ");
       choice=input.nextLine();
       
        new Motorcycle(choice);
        
        input.close();

	}
}
