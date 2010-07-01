package nl.javasteam.dotcomgame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class SimpleDotComTest extends TestCase {

	private static SimpleDotCom instance;

	protected void setUp() throws Exception {
		instance = new SimpleDotCom();
		List<String> locations = new ArrayList<String>();
		locations.add("2");
		locations.add("3");
		locations.add("4");
		instance.setLocationCells(locations);
	}

	public void testMiss() {
		assertEquals("miss", instance.checkYourself("1"));
	}

	public void testHit() {
		assertEquals("hit", instance.checkYourself("2"));
	}

	public void testKill() {
		instance.checkYourself("2");
		instance.checkYourself("3");
		assertEquals("kill", instance.checkYourself("4"));
	}

	public void testSameGuessRepeated() {
		instance.checkYourself("2");
		assertEquals("miss", instance.checkYourself("2"));
	}

	public void testIsValid() {
		assertTrue(instance.isValid("Martijn"));
		assertFalse(instance.isValid("Adriaan"));
	}
}
