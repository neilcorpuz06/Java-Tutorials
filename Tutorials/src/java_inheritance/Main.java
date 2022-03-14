package java_inheritance;

public class Main {

	public static void main(String[] args) {

		Parent_superclass parent = new Parent_superclass("Neil","Male",28);
		Child_subclass child = new Child_subclass("Clynt","Male",7, "Walking");
        Grandchild_subclass grand_child = new Grandchild_subclass("Elanor","Molina",6,"PS4", "blue",12);
		/*
		 * parent.name = "Neil"; parent.gender = "Male"; parent.age = 28;
		 * 
		 * child.name = "CLynt"; child.gender = "Male"; child.age = 7;
		 */
		parent.checkStatus();
		child.checkStatus();
		grand_child.checkStatus();

		// Using the static keyword i call the method drink from Chil_subclass class.
		child.Drink();
		grand_child.sayGradeLevel();
		
	}

}
