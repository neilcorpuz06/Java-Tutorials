package java_polymorphism;

public class Main {

	public static void main(String[] args) {

		Animals foodle = new Dog();
		Animals persian = new Cat();
		Animals eagle = new Bird();
		
		foodle.makeSound();
		persian.makeSound();
		eagle.makeSound();
	}
}
