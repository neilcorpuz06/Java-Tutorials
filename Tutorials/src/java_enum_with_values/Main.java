package java_enum_with_values;

import display.Display;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * USCurrency money = USCurrency.PENNY; Display.print("The value of Penny is "
		 * +money.val);
		 */
		/* The output will be Penny is 0.01 */
	   
	   USCurrency money = USCurrency.NICKLE;
	   Display.print("The value of " +money.name+ " is " +money.val);
		/* The output will be Nickel is 0.05 */
	}

}
