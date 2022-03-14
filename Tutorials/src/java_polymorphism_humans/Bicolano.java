package java_polymorphism_humans;

import display.Display;

public class Bicolano extends Filipino{
	String gender;
	
    @Override
    public void canSpeak() {
    	super.canSpeak();
    	Display.printLine("and my dialect is Bicolano");
    }
}
