package java_inheritance;

public class Parent_superclass {
	String name, gender;
	int age;

	public Parent_superclass(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	void checkStatus() {
		System.out.println("Name   : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("Age    : " + age);
	}
}
