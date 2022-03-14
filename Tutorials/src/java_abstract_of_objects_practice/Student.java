package java_abstract_of_objects_practice;

public class Student {

	private String first_name, last_name, course, section;
    private int school_year;

    Student(String first_name, String last_name,String course,String section,int school_year){
    	this.first_name = first_name;
    	this.last_name = last_name;
    	this.course = course;
    	this.section = section;
    	this.school_year = school_year;
    }
    
    void introduceSelf() {
    	System.out.println();
 	    System.out.println("First name  : "+first_name);   
 	    System.out.println("Last name   : "+last_name);   
 	    System.out.println("Course      : "+course);   
 	    System.out.println("Section     : "+section);   
 	    System.out.println("School Year : "+school_year);   
    }
}
