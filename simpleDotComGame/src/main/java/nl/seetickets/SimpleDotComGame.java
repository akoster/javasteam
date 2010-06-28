package nl.seetickets;

import java.util.ArrayList;


public class SimpleDotComGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		
		SimpleDotCom dot = new SimpleDotCom();
		
		int randomNumber = (int)(Math.random() * 5);
		ArrayList<String> loc = new ArrayList<String>();
		loc.add(String.valueOf(randomNumber));
		loc.add(String.valueOf(randomNumber + 1));
		loc.add(String.valueOf(randomNumber + 2));
		
		dot.setLocationCells(loc);
		boolean isAlive = true;
		
		while (isAlive) {
			String guess = helper.getUserInput("Enter a number");
			String result = dot.checkYourself(guess);
			
			System.out.println(result);
			
			numOfGuesses++;
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("Number of guesses: " + numOfGuesses);
			}
		}
	}

}
