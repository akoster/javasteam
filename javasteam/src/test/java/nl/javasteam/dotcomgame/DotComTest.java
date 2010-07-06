package nl.javasteam.dotcomgame;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class DotComTest extends TestCase {

	private DotCom instance;

	protected void setUp() throws Exception {
		super.setUp();
		instance = new DotCom();
	}

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
