package nl.javasteam.dotcomgame;

import java.util.ArrayList;
import java.util.List;

public class DotComBust {

	private int numOfGuess = 0;
	private GameHelperDotCom helper = new GameHelperDotCom();
	private List<DotCom> dotComList = new ArrayList<DotCom>();
	
	
	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startGame();
	}
	
	private void setUpGame() {
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
				
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
		
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink all in the fewest number of guesses");
		
		for(DotCom dotComToSet : dotComList){
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startGame() {
		while(!dotComList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		endGame();
	}
	
	private void checkUserGuess(String userGuess) {
		numOfGuess++;		
		String result = "miss";
		
		for(DotCom dotComToTest : dotComList){
			result = dotComToTest.checkYourSelf(userGuess);
			
			if(result.equals("hit")){
				break;
			}
			if(result.equals("kill")){
				dotComList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}
	
	private void endGame() {
		System.out.println("All dot coms are dead!");
		if(numOfGuess <= 18){
			System.out.println("It only took you " + numOfGuess + " guesses.");
		} else {
			System.out.println("Took you long enough. " + numOfGuess + " guesses.");			
		}
	}

}
