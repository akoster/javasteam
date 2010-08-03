package nl.javasteam.antipatterns.constructor;

public class App {

	public static void main(String[] args) {

		System.out.println("BUILD AN ANIMAL :");
		new Animal();

		System.out.println("BUILD A FISH :");
		new Fish();
	}
}
