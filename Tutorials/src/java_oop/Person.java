package java_oop;

//a class person
public class Person {

	// Attributes
	String fname;
	String lname;
	char gender;
	int age;

	Person(String fname, String lname, char gender, int age) {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;

		System.out.println("Your name is " + fname + " " + lname);
		System.out.println("Your gender is " + gender + " and your age is " + age);
	}
}
