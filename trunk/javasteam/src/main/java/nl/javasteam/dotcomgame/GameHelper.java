package nl.javasteam.dotcomgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GameHelper {
	
	private InputStream in;

	public GameHelper() {
		in = System.in;
	}
	
	public void setIn(InputStream in) {
		this.in = in;
	}

	public String getUserInput(String prompt) {

		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(in));
			inputLine = is.readLine();
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine;
	}
}
