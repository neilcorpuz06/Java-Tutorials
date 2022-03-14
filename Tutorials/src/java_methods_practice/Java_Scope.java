package java_methods_practice;

public class Java_Scope {
static String name = "Neil"; //need to put static of 'GLOBAL VARAIBLE' declaration.
	
	public static void main(String[] args) {
     sayName();
	}
	
	static void sayName() {
	   System.out.println("My name is: " +name);
	   sayHi();
	}
	
	static void sayHi() {
		String greet = "Hi! "; //LOCAL VARAIBLE
		System.out.println(greet + name + " My name is Anne");
	}
}
