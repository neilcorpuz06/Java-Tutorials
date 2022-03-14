package java_array_of_objects;

public class Employee {
   String firstName, lastName;
   String jobTitle;
   
   Employee(String firstName, String lastName, String jobTitle){
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.jobTitle = jobTitle;
   }
   
   void introduceSelf() {
	   System.out.println("Fulname   : " +firstName+" "+lastName);
	   System.out.println("Job Title : " +jobTitle);
	   System.out.println();
   }
}
