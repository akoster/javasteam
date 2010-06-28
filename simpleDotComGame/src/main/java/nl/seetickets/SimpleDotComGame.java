package nl.seetickets;


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
		int[] loc = {randomNumber, randomNumber + 1, randomNumber + 2};
		
		dot.setLocationCells(loc);
		boolean isAlive = true;
		
		while (isAlive) {
			String guess = helper.getUserInput("Enter a number");
			String result = dot.checkYourself(guess);
			numOfGuesses++;
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("Number of guesses: " + numOfGuesses);
			}
		}
	}

}
