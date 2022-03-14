package java_methods_practice;

public class Methods_Challenge {

	public static void main(String[] args) {
		//Decalring an array that have name numbers.
		int numbers [] = {1,2,3,4,5};
        int results;
        
        //assigning the summation method in results varaible to get the output.
        results = summation(numbers);
       
        //printing method + the results variable
		print("The results is: " +results);
	}
	
	//Summation Method.
	static int summation(int numbers[]) {
		int sum = 0;
		
		//For each loop
		for(int number: numbers) {
		sum  = sum +number;	
		}
		return sum; //returning the sum.
	}
	
	//Print Method.
	static void print(String word) {System.out.println(word);}
	
	/* ------Program by Neil John Corpuz A.S.E.T--------- */
}
