package nl.javasteam.patterns.decorator;

/**
 * Calculator for fees based on an hourly rate
 * 
 * @author mlapre
 */
public class FeeCalculator implements Calculator {

	private int rateEuros;

	/**
	 * Creates an instance which uses the given rate
	 * 
	 * @param rateEuros
	 */
	public FeeCalculator(int rateEuros) {
		this.rateEuros = rateEuros;
	}

	public double calculate(int hours) {
		return hours * rateEuros;
	}
}
