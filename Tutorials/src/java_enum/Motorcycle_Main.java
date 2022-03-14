package java_enum;

import java.util.Scanner;


public class Motorcycle_Main {
	public static void main(String[] args) {

		Scanner client_input = new Scanner(System.in);
		int motor;

		System.out.println("0:Mio 1:Yamaha 2:Kawasaki 3:Susuki");
		System.out.print("Input your Brand: ");

		motor = Integer.parseInt(client_input.nextLine());

		switch (Motorcycle.values()[motor]) {

		case Mio:
			System.out.println("\nYou choose Mio Brand motorcycle");
			break;
		case Honda:
			System.out.println("\nYou choose Honda Brand motorcycle");
			break;
		case Kawasaki:
			System.out.println("\nYou choose Kawasaki Brand motorcycle");
			break;
		case Susuki:
			System.out.println("\nYou choose Susuki Brand motorcycle");
			break;
		default:
			System.out.println("The number you enter is out of range");
			System.out.println("Select from 0 to 3");
		}

		client_input.close();
	}
}
