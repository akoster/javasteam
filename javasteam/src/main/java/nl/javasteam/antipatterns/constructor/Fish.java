package nl.javasteam.antipatterns.constructor;

class Fish extends Animal {

	private String name;

	public Fish() {		
		// super() is called implicitly 
		// during Animal() construction printName() is called				
		name = "Fish";
		addFeature("Scales", "Fins", "Gills");
	}

	public void printName() {
		// printname depends on initialization of the 'name' field
		// but it is called before that, so causes a NullpointerExcption here
		System.out.println("I am a " + name.toString());
	}
}