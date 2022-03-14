package java_methods_practice;

import java.util.Scanner;

public class AddTwoNumbers_with_methods {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int a, b,sum, quotient, product, difference;
		
		print("Enter value of number 1: ");
		a = console.nextInt();
		
		print("Enter value of number 2: " );
		b = console.nextInt();
		
		sum = Add(a, b);
		quotient = Divide(a, b);
		product = Multiply(a, b);
		difference = Subtract(a, b);
		
		printLine("The sum is: " +sum);
		printLine("The quotient is: " +quotient);
		printLine("The prodcut is: " +product);
		printLine("The difference is: " +difference);
		console.close(); 
	}
	
	
	// My Methods
	
	static void print(String word) {
		System.out.print(word);
	}
	static void printLine(String word) {
		System.out.println(word);
	}
	
	//Addition method
	static int Add(int num1, int num2) {return num1 + num2;}
	//Division method
	static int Divide(int num1, int num2) {return num1 / num2;}
	//Multiplication method
	static int Multiply(int num1, int num2) {return num1 * num2;}
	//Subtraction method
	static int Subtract(int num1, int num2) {return num1 - num2;}

	/* ------Program by Neil John Corpuz A.S.E.T--------- */
}
