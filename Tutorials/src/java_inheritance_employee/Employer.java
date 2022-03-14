package java_inheritance_employee;

public class Employer {
    String first_name, last_name, title;
    
    
    Employer(String first_name, String last_name, String title){
    	this.first_name = first_name;
    	this.last_name = last_name;
    	this.title = title;
    }
   
    public static void greetings() {
    	System.out.println("\n"+"Welcome to new Joiners!\n");
    }
    
    
    void showDetails() {
    	System.out.println("First name : " +first_name);    	
    	System.out.println("Last name  : " +last_name);    	
    	System.out.println("Job title  : " +title);    	
    }
}
