package java_encapsulation;

public class Users {
	private int user_id; //number;
	private String user_name;
	private String first_name,last_name;
	
	
	Users(int user_id, String user_name, String first_name, String last_name){
		this.user_id = user_id;
		this.user_name = user_name;
		this.first_name = first_name;
		this.last_name = last_name;
		
	}
	
//	// Setter method example is can edit the first value that enter
//	void setuserID(int user_id) {
//		this.user_id = user_id;
//		System.out.println("The User ID is: " +user_id);
//	}
//	
//	void setuserName(String user_name) {
//		this.user_name = user_name;
//		System.out.println("The Username is: " +user_name);
//	}
//	void setuserFirstname(String first_name) {
//		this.first_name = first_name;
//		System.out.println("The User First Name is: " +first_name);
//	}
//	void setuserLastname(String last_name) {
//		this.last_name = last_name;
//		System.out.println("The User Last Name is:" +last_name);
//	}
//	// Getter method example and the getter is for read only
//	int getNumber(int number) {
//		System.out.print("the number you enter is: " +number);
//		return number;
//	}
	
	
   void showDetails() {
	   
	   System.out.print(user_id +user_name+ first_name +last_name);
   }
   
}
