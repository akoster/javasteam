package nl.javasteam.dotcomgame;

import java.io.IOException;
import java.io.InputStream;

import junit.framework.TestCase;

public class GameHelperTest extends TestCase {

	private GameHelper instance;

	protected void setUp() throws Exception {
		super.setUp();
		instance = new GameHelper();
		
		// anonymous inner class
		InputStream in = new InputStream() {

			// TODO AKO: find out how to terminate the input of an InputStream
			// correctly
			int[] data = new int[] { 'p', 'i', 'e', 't', 'j', 'e', 'p', 'u',
					'k', '\r', '\n', '\n' };
			int index = 0;

			@Override
			public int read() throws IOException {
				return data[index++];
			}
		};
		instance.setIn(in);
	}

	public void testGetUserInput() {
		String result = instance.getUserInput("bla");
		assertEquals("pietjepuk", result);
	}

}
