package java_abstract_classes;

public class Main {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal pig = new Pig();
		
		//Dog
		dog.animalType();
		dog.setName("Doggy");
		dog.makeSound();
		
		//Cat
		cat.animalType();
		cat.setName("Pussy");
		cat.makeSound();
		
		//Pig
		cat.animalType();
		pig.setName("Piggy");
		pig.makeSound();

	}

}
