package nl.javasteam.dotcomgame;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

public class GameHelperTest {

	private GameHelper instance;

	@Before
	public void setUp() throws Exception {
		instance = new GameHelper();

		// anonymous inner class
		InputStream in = new InputStream() {

			static final byte inputStreamTerminationByte = -1;
			byte[] data = new byte[] { 'p', 'i', 'e', 't', 'j', 'e', 'p', 'u',
					'k', '\n', inputStreamTerminationByte };
			int index = 0;

			@Override
			public int read() throws IOException {
				return data[index++];
			}
		};
		instance.setIn(in);
	}

	@Test
	public void testGetUserInput() {
		String result = instance.getUserInput("");
		assertEquals("pietjepuk", result);
	}

}
