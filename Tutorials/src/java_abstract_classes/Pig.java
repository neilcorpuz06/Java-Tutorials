package java_abstract_classes;

import display.Display;

public class Pig extends Animal {
	
	@Override
	void animalType() {
	   Display.printLine("Animal Type: Pig");		
	}
	
	@Override
	void makeSound() {
		Display.printLine("Pig sound: Oink Oink");
		Display.printLine("\n");
	}
}
