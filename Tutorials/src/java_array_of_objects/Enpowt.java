package java_array_of_objects;

import java.util.Scanner;

public class Enpowt {

	public static void main(String[] args) {
        
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("Enter int :");
		int n = sc.nextInt();
		sc.nextLine();//put this to avoid error if the first input is integer 
		
		System.out.print("Enter string :");
		String s = sc.nextLine();
		
		System.out.println("Integer : " +n);
		System.out.println("String  :" +s);
		sc.close();
	}

}
