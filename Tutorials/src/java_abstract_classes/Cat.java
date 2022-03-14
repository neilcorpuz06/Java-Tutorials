package java_abstract_classes;

import display.Display;

public class Cat extends Animal {
	
	@Override
	void animalType() {
	   Display.printLine("Aninmal Type: Cat");		
	}
	
	@Override
	void makeSound() {
		Display.printLine("Cat sound: Meow Meow");
		Display.printLine("\n");
	}
}
