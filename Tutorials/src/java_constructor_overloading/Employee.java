package java_constructor_overloading;

public class Employee {
	
	/*I removed the private that will use for encapsulation.
	/*private*/ String first_name, last_name;
	/*private*/ String title, address, gender;
	/*private*/ int age;
	
	//Constructor with no parameter
	Employee(){
	    first_name = "N/A";
	    last_name = "N/A";
	    title = "N/A";
	    address = "N/A";
	    gender = "N/A";
	    age = 0;
		
	}
	//Get the essential information using the constructor overloading.
	Employee(String first_name, String last_name, String title){
		this.first_name = first_name;
		this.last_name = last_name;
		this.title = title;
	}

	//Constructor Employee
	Employee(String firs_name,
			String last_name,
			String title,
			String address,
			String gender,
			int age){
		
		   this.first_name = firs_name;
		   this.last_name = last_name;
		   this.title = title;
		   this.address = address;
		   this.gender = gender;
		   this.age = age;		
	}
	
	// this technique is Constructor overloading different constructor different parameter.
	
	//Static class
	public static void showGreetings() {
		System.out.println("\nWelcome to Fujitsu!");
	}
	
}
