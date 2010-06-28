package nl.seetickets;

import java.util.ArrayList;

public class SimpleDotComTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleDotCom dot = new SimpleDotCom();
		ArrayList<String> locations = new ArrayList<String>();
		locations.add("2");
		locations.add("3");
		locations.add("4");
		
		dot.setLocationCells(locations);
		
		String testResult = "failed";
		
		String userGuess = "1";		
		String result = dot.checkYourself(userGuess);
		
		if(result == "hit"){
			testResult = "passed";
		} else if(result == "miss") {
			testResult = "passed";
		} 
		
		System.out.println(testResult);
	}
}
