package java_abstract_classes;

import display.Display;

public class Dog extends Animal{
	
	@Override
	void animalType() {
          Display.printLine("Animal Type:  Dog");		
	}
	
    @Override
    void makeSound() {
    	Display.printLine("Animal sound: Arf Arf");
    	Display.printLine("\n");
    }
}
