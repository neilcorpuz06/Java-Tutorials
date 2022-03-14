package java_abstract_classes;

import display.Display;

// the use of abstraction is to hide the general idea which is the Animal
public abstract class Animal {
	String animal_name;
	
	// abstract method without body.
	abstract void animalType();
	abstract void makeSound();	
	
	void setName(String name) {
		this.animal_name = name;
		Display.printLine("Animal Name: " +animal_name);
	}
}
