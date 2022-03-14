package java_inheritance;

public class Grandchild_subclass extends Child_subclass{
  
	public static final String Child_subclass = null;
	String favorite_color;
	int grade_level;
	
	public Grandchild_subclass(String name, 
			String gender, 
			int age, 
			String 
			favorite_game, 
			String favorite_color,
			int grade_level) 
	{
		super(name, gender, age, favorite_game);
		this.favorite_color = favorite_color;
		this.grade_level = grade_level;
	}
	
	@Override
	void checkStatus() {
		super.checkStatus();
		System.out.println("Favorite Color is: " +favorite_color);
	}
	
	@Override
	public void Drink() {
		super.Drink();
		System.out.println("Going to school now.");
	}
	
	void sayGradeLevel() {
		System.out.println("I am grade " +grade_level);
	}
}
