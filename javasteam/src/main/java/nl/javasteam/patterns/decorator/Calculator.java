package nl.javasteam.patterns.decorator;

/**
 * Calculator for fees 
 * 
 * @author mlapre
 */
public interface Calculator {

	/**
	 * Calculates the fee for the given number of hours
	 * 
	 * @param i
	 * @return
	 */
	double calculate(int hours);

}
