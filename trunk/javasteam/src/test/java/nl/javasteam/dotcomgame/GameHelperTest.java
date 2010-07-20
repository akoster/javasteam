package nl.javasteam.dotcomgame;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

public class GameHelperTest {

	private GameHelper instance;

	private static final String input = "pietjepuk";

	@Before
	public void setUp() throws Exception {
		instance = new GameHelper();

		// anonymous inner class
		InputStream in = new InputStream() {

			byte[] data = input.getBytes();
			int index = 0;

			@Override
			public int read() throws IOException {
				if (index < data.length) {
					return data[index++];
				}
				// terminate input stream
				return -1;
			}
		};
		instance.setIn(in);
	}

	@Test
	public void testGetUserInput() {
		String result = instance.getUserInput("PROMPT");
		assertEquals(input, result);
	}

}
