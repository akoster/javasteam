package nl.javasteam.patterns.decorator;

/**
 * Calculator for VAT based on an amount
 * 
 * @author mlapre
 */
public class VatCalculator implements Calculator {

	private static final double DEFAULT_VAT = 1.19;
	private double vat;
	private Calculator calculator;

	/**
	 * Creates an instance which uses a default VAT
	 * 
	 * @param calculator
	 */
	public VatCalculator(Calculator calculator) {
		this(DEFAULT_VAT, calculator);
	}

	/**
	 * Creates an instance which uses the given VAT percentage
	 * 
	 * @param vatPercentage
	 * @param calculator
	 */
	public VatCalculator(double vatPercentage, Calculator calculator) {

		this.calculator = calculator;
		// convert percentage to factor
		this.vat = 1.0 + (vatPercentage / 100);
	}

	public double calculate(int hours) {

		return calculator.calculate(hours) * vat;
	}

}
