package nl.javasteam.antipatterns.constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Animal {

	private ArrayList<String> features;

	public Animal() {

		// This is bad. printName() can be overriden in a subclass and contain
		// code which depends on the class construction to be complete. However
		// printName() is called from the Animal() constructor, before the
		// subclass constructor is completed.
		printName();

		// This is ok. init() is private. Other classes can not call this
		// method, nor override it.
		init();

		// This is also ok. addFeature() is final, other classes can call this
		// method, but not override it.
		addFeature("Heart");
	}

	public void printName() {
		System.out.println("I am an Animal");
	}

	private void init() {
		features = new ArrayList<String>();
	}

	public final void addFeature(String... features) {
		this.features.addAll(Arrays.asList(features));
	}
}