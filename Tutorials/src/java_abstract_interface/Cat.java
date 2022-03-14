package java_abstract_interface;

import display.Display;

public class Cat implements Animal, LandAnimal {
	@Override
	public void animalType() {
		Display.printLine("Cat");	
	}
	@Override
	public void makeSound() {
		Display.printLine("Meow Meow");
	}
	
	@Override
	public void walk() {
		Display.printLine("I can walk with 4 legs");
	}
}
