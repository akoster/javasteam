package nl.seetickets;

public class SimpleDotCom {

	int[] locationCells;
	int numOfHits = 0;
	
	public String checkYourself(String userGuess){
		
		String result = "missed";
		
		int guess = Integer.parseInt(userGuess);
		
		for (int cell:locationCells) {
			if(cell == guess){
				numOfHits++;
				result = "hit";
				break;
			}
		}
		
		if(numOfHits == 3){
			result = "kill";
		}
		
		System.out.println(result);
		return result;
	}
	
	public void setLocationCells(int[] loc){
		locationCells = loc;
	}
	
}
