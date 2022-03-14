package java_object_methods;

public class Main {

	public static void main(String[] args) {

		// Calling the class name Character and instantiate.
		Character c = new Character("Neil", "Hello Good morning", 100, 50, 5);
		Character c1 = new Character("John", "Hi! Good evening", 100, 50, 5);

//		c.introduce();
//		c1.introduce();
//		c.showDialog();

//		c.talkTo("Jenny");
//		c1.talkTo("Jenny");
		
//		c.talkToCharacter(c1);
//		c1.talkToCharacter(c);
		
		System.out.println(c.talkReturn(c1));
	}

}
