package nl.javasteam.patterns.decorator;

/**
 * Calculator for fees based on an hourly rate
 * 
 * @author mlapre
 */
public class FeeCalculator implements Calculator {

	private int rate;

	public FeeCalculator(int rate) {
		this.rate = rate;
	}

	public double calculate(int hours) {
		return hours * rate;
	}
}
