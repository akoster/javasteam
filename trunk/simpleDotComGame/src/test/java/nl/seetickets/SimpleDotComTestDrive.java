package nl.seetickets;

import java.util.ArrayList;
import java.util.List;

public class SimpleDotComTestDrive {

	private static SimpleDotCom instance;

	private static void init() {
		instance = new SimpleDotCom();
		List<String> locations = new ArrayList<String>();
		locations.add("2");
		locations.add("3");
		locations.add("4");
		instance.setLocationCells(locations);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		init();

		testCheckYourself("1", "miss");
		testCheckYourself("2", "hit");
		testCheckYourself("3", "hit");
		testCheckYourself("4", "kill");

		System.out.println("Test completed");
	}

	private static void testCheckYourself(String userInput, String expectedValue) {
		String actualValue = instance.checkYourself(userInput);
		if (!expectedValue.equals(actualValue)) {
			System.out.println("TEST FAILED: for input "+ userInput + " expected " + expectedValue
					+ " actual " + actualValue);
		}
	}
}
