package java_polymorphism_humans;

import display.Display;

public class Human {

	String race;
    
	public void canSpeak() {
		Display.printLine("I am speaking");
	}
	public void canWalk() {
		Display.printLine("I can walk");
	}
}
