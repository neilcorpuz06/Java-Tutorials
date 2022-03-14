package java_inheritance;

public class Child_subclass extends Parent_superclass{

	/*
	 * public static void main(String[] args) {
	 * 
	 * // Using the static keyword i call the method drink inside of this class.
	 * Child_subclass.Drink(); }
	 */
	// Public method in a child class
    
	String favorite_game;//declaring new variable to put in constructor.
    
	public Child_subclass(String name, String gender, int age, String favorite_game) {
		super(name, gender, age);
		this.favorite_game = favorite_game;
	}
	
	public void Drink() {
		System.out.println("\nFrom Child Class");
		System.out.println("Drink Milk Now!");
	}
	
	@Override
	void checkStatus() {
		super.checkStatus();
		System.out.println("Favorite game is: " +favorite_game);
	}
}
