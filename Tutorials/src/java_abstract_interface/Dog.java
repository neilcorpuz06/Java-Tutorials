package java_abstract_interface;

import display.Display;

public class Dog implements Animal, LandAnimal{
	
	@Override
	public void animalType() {
		Display.printLine("Dog");	
	}
    @Override
    public void makeSound() {
    	Display.printLine("Arf Arf");
    }
    
    @Override
    public void walk() {
    	Display.printLine("I can walk with 4 legs");	
    }
}
