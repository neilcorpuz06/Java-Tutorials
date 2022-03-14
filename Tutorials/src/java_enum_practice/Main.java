package java_enum_practice;

import java.util.Scanner;
import display.Display;

public class Main {

	public static void main(String[] args) {
	
        Scanner console = new Scanner(System.in);
       
        try {
        	  Display.print("Enter money: ");
              int money = Integer.parseInt(console.nextLine());
              //ACCESING THE VALUE BY INDEX.
        	 switch(PHMoney.values()[money]) {
        	 case PESO:
        		 Display.printLine("ONE PESOS");
        		 break;
        	 case FIVE:
        		 Display.printLine("FIVE PESOS");
        		 break;
        	 case TEN:
        		 Display.printLine("TEN PESOS");
        		 break;
        	 case TWENTY:
        		 Display.printLine("TWENTY PESOS");
        		 break;
        	 case FIFTY:
        		 Display.printLine("FIFTY PESOS");
        		 break;
        	 case ONEHUNDRED:
        		 Display.printLine("ONE HUNDRED PESOS");
        		 break;
        	 case TWOHUNDRED:
        		 Display.printLine("TWON HUNDRED PESOS");
        		 break;
        	 case ONETHOUSAND:
        		 Display.printLine("ONE THOUSAND PESOS");
        		 break;
     		default:
     			break;
             }
		} catch (Exception e) {
			Display.printLine("Invalid Input!");
		}
        
		console.close();/* close the scanner */
	}

}
