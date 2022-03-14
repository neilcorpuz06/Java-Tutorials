package java_enum;

import java.util.Scanner;
import display.Display;

public class Main {
	public static void main(String[] args) {

		// CREATE AN IDENTIFIER
		/* AILevel level = AILevel.EASY; */
		/* Display.print(""+level); */
		/* IF ELSE STATEMENT */
		/*
		 * if (level == AILevel.EASY) { Display.print("Your Level is :" + level); } else
		 * if (level == AILevel.MEDIUM) { Display.print("Your Level is :" + level); }
		 * else if (level == AILevel.HARD) { Display.print("Your Level is :" + level); }
		 */

		/* USING USER INPUT */
		Scanner console = new Scanner(System.in);
		String level;

		Display.printLine("Enter Level from Easy, Medium and Hard.");
		Display.print("Input here : ");
		level = console.nextLine().toUpperCase();

		try {
			switch (AILevel.valueOf(level)) {
			case EASY:
				Display.printLine("Im Easy");
				break;
			case MEDIUM:
				Display.printLine("Im Medium");
				break;
			case HARD:
				Display.printLine("Im so Hard");
				break;
			default:
				break;
			}
		} catch (Exception e) {
			Display.print("Invalid Input!");
		}
		console.close();
	}

}
