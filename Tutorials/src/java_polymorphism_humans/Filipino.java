package java_polymorphism_humans;

import display.Display;

public class Filipino extends Human {
	String name;
	int age;
	
	public void canSpeak() {
		Display.printLine("Kamusta I am Filipino");
	}

}
