package java_object_methods;

public class Character {
	String name, dialog;
	int hp, mp, lvl;
	
	
	//Constructor 
	Character(String name, String dialog, int hp, int mp, int lvl){
		this.name = name;
		this.dialog = dialog;
		this.hp = hp;
		this.mp = mp;
		this.lvl = lvl;
	}
	
	void introduce() {
		System.out.print("I am " +name+ ", ");
		System.out.println(dialog);
	}
	void showDialog() {
		
		System.out.println("Hi! There");
	}
	void talkTo(String firstname) {
		System.out.println(dialog + ", I am " +name+ " Hi! " +firstname);
	}
	void  talkToCharacter(Character c) {
		
	   System.out.println("My name is " +name+ ", Hi!"+c.name);	
	}
	
    //Return type
	String talkReturn(Character c) {
		return name+ ", Hi!" +c.name;
		
	}
	
	
}
