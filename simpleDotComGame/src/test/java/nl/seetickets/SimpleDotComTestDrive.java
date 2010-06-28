package nl.seetickets;

public class SimpleDotComTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		
		String testResult = "failed";
		
		String userGuess = "1";		
		String result = dot.checkYourself(userGuess);
		
		if(result == "hit"){
			testResult = "passed";
		} else if(result == "missed") {
			testResult = "passed";
		} 
		
		System.out.println(testResult);
	}
}
