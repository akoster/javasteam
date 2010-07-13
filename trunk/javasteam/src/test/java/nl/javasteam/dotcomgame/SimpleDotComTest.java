package nl.javasteam.dotcomgame;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SimpleDotComTest {

	private static SimpleDotCom instance;

	@Before
	public void setUp() throws Exception {
		instance = new SimpleDotCom();
		List<String> locations = new ArrayList<String>();
		locations.add("2");
		locations.add("3");
		locations.add("4");
		instance.setLocationCells(locations);
	}

	@Test
	public void testMiss() {
		assertEquals("miss", instance.checkYourself("1"));
	}

	@Test
	public void testHit() {
		assertEquals("hit", instance.checkYourself("2"));
	}

	@Test
	public void testKill() {
		instance.checkYourself("2");
		instance.checkYourself("3");
		assertEquals("kill", instance.checkYourself("4"));
	}

	@Test
	public void testSameGuessRepeated() {
		instance.checkYourself("2");
		assertEquals("miss", instance.checkYourself("2"));
	}

	@Test
	public void testIsValid() {
		assertTrue(instance.isValid("Martijn"));
		assertFalse(instance.isValid("Adriaan"));
	}
}
