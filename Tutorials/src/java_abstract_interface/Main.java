package java_abstract_interface;

import display.Display;

public class Main {

	public static void main(String[] args) {
		
		/* Do not use this for Interface abstract. 
		 * this instantiation is for inheritance only
		 * Animal dog = new Dog();
	     * Animal cat = new Cat();
		 */
		
		//Instead use this intstantiation.
	
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		Frog frog = new Frog();
		
		//Dog
		dog.animalType();
		dog.makeSound();
		dog.walk();
		
		Display.printLine("\n");
		//Cat
		cat.animalType();
		cat.makeSound();
		cat.walk();
		
		Display.printLine("\n");
		//Bird
		bird.animalType();
		bird.makeSound();
		bird.fly();
		bird.walk();
		
		Display.printLine("\n");
		//Frog
		frog.animalType();
		frog.makeSound();
		frog.swim();
		frog.walk();

	}

}
