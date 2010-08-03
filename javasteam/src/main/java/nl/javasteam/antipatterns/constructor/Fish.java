package nl.javasteam.antipatterns.constructor;

class Fish extends Animal {

	private String fishName;

	public Fish() {
		printName();
	}
	
	public void setName(String fishName) {
		this.fishName = fishName;
	}

	/**
	 * Please call setName before calling printName
	 */
	public void printName() {
		System.out.println("Fish name is " + fishName.toString());
	}
}