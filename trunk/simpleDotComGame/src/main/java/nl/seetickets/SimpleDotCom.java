package nl.seetickets;

import java.util.List;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SimpleDotCom {

	private List<String> locationCells;

	public String checkYourself(String userInput) {

		String result = "miss";
		int index = locationCells.indexOf(userInput);

		if (index >= 0) {

			locationCells.remove(index);

			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		return result;
	}

	public void setLocationCells(List<String> loc) {
		locationCells = loc;
	}

	public boolean isValid(String userName) {
		// throw new NotImplementedException();

		return ("Martijn".equals(userName));
	}

}
