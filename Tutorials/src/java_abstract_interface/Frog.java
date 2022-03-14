package java_abstract_interface;

import display.Display;

public class Frog implements Animal,LandAnimal, WaterAnimal {
	@Override
	public void animalType() {
		Display.printLine("Frog");	
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		Display.printLine("Ribbit Ribbit");
	}
	
	@Override
	public void swim() {
		Display.printLine("I can swim in the lake");		
	}
	
	@Override
	public void walk() {
		Display.printLine("I can jump with two legs");
	}
}
