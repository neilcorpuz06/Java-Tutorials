package java_abstract_interface;

import display.Display;

public class Bird implements Animal, AirAnimal, LandAnimal{
	@Override
	public void animalType() {
		Display.printLine("Bird");	
	}
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		Display.printLine("Chirp Chirp");
	}
	
	@Override
	public void fly() {
		Display.printLine("I can fly with wings");
	}
	
	@Override
	public void walk() {
		Display.printLine("I can walk with 2 legs");
	}

}
