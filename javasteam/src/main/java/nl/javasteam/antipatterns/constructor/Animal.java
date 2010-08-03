package nl.javasteam.antipatterns.constructor;

public class Animal {

	private String name;

	public Animal() {
		name = "Animal";
		printName();
	}

	private void printName() {
		System.out.println("My name is " + name.toString());
	}
}