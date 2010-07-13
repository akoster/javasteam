package nl.javasteam.dotcomgame;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class DotComTest {

	private DotCom instance;

	@Before
	public void setUp() throws Exception {
		instance = new DotCom();
	}

	@Test
	public void testCheckYourSelf() {
		ArrayList<String> loc = new ArrayList<String>();
		instance.setLocationCells(loc);

		String checkYourSelf = instance.checkYourSelf("C5");
		assertEquals("miss", checkYourSelf);

		loc.add("C5");
		loc.add("A2");
		checkYourSelf = instance.checkYourSelf("C5");
		assertEquals("hit", checkYourSelf);

		checkYourSelf = instance.checkYourSelf("A2");
		assertEquals("kill", checkYourSelf);

	}

}
