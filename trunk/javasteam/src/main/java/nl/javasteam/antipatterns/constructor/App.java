package nl.javasteam.antipatterns.constructor;

public class App {

	public static void main(String[] args) {

		System.out.println("new Animal:");
		new Animal();

		System.out.println("new Fish");
		try {
			new Fish();
		} catch (NullPointerException e) {
			throw new RuntimeException(
					"NullpointeException thrown as expected. "
							+ "Animal calls an overridable method "
							+ "from the constructor", e);
		}
	}
}
