package java_encapsulation;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Users user = new Users(2017500014," neil006"," Neil ","Corpuz");
		
//        user.setuserID(2017500014);
//        user.setuserName("neil006");
//        user.setuserFirstname("Neil");
//        user.setuserLastname("Corpuz");
//        
//        
//        Scanner input = new Scanner(System.in);
//        		
//        System.out.print("Enter number: ");
//        int num1 = input.nextInt();
//        
//        user.getNumber(num1);
//        
//        input.close();
	   user.showDetails();
	}

}
