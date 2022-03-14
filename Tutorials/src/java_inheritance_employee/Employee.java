package java_inheritance_employee;

public class Employee extends Employer {
   
	String address, gender;
	int age;
	
	Employee(String first_name, 
			String last_name, 
			String title, 
			String address, 
			String gender,int age) {
		super(first_name, last_name, title);//using the super keyword i able to
		this.address = address;             // inherit the constructor of Employer.
		this.gender = gender;
		this.age = age;
	}
	
	@Override
	void showDetails() {
		super.showDetails(); //using super to inherit the showDetails of Employer and Override.
		System.out.println("Address    : " +address);
		System.out.println("Gender     : " +gender);
		System.out.println("Age        : " +age);
	}
}
