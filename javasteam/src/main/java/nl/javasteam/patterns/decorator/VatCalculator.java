package nl.javasteam.patterns.decorator;

/**
 * Calculator for VAT based on an amount
 * 
 * @author mlapre
 */
public class VatCalculator implements Calculator {

	private double vat = 1.19;
	private Calculator calculator;

	public VatCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public Calculator setVatPercentage(double vatPercentage) {
		// TODO: check for negative values
		this.vat = 1.0 + (vatPercentage / 100);
		return this;
	}
	public double calculate(int hours) {
		return calculator.calculate(hours) * vat;
	}

}
