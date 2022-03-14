package java_constructor_overloading;

public class Main {

	public static void main(String[] args) {
   
		Employee emp = new Employee();
		Employee emp1 = new Employee("Neil","Corpuz","Programmer");
		Employee emp2 = new Employee("John","Molina","Web Developer","Bulacan","Male",28);
		
		
		System.out.println("Employee No.1");
		System.out.println(emp.first_name);
		System.out.println(emp.last_name);
		System.out.println(emp.title);
		System.out.println(emp.address);
		System.out.println(emp.gender);
		System.out.println(emp.age);
		
		System.out.println("\nEmployee No.2");
		System.out.println(emp1.first_name);
		System.out.println(emp1.last_name);
		System.out.println(emp1.title);
		
		System.out.println("\nEmployee No.3");
		System.out.println(emp2.first_name);
		System.out.println(emp2.last_name);
		System.out.println(emp2.title);
		System.out.println(emp2.address);
		System.out.println(emp2.gender);
		System.out.println(emp2.age);
		
		Employee.showGreetings();
	}

}
