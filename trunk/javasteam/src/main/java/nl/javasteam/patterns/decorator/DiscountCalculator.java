package nl.javasteam.patterns.decorator;

public class DiscountCalculator implements Calculator {

	private static final double DEFAULT_DISCOUNT = 0.1;
	private Calculator calculator;
	private double discount;

	/**
	 * Creates an instance which uses a default discount
	 * 
	 * @param calculator
	 */
	public DiscountCalculator(Calculator calculator) {
		this(DEFAULT_DISCOUNT, calculator);
	}

	/**
	 * Creates an instance which uses the given discount percentage
	 * 
	 * @param discountPercentage
	 * @param calculator
	 */
	public DiscountCalculator(double discountPercentage, Calculator calculator) {

		this.calculator = calculator;
		// convert discountPercentage to factor
		this.discount = 1.0 - (discountPercentage / 100);
	}

	public double calculate(int hours) {
		return calculator.calculate(hours) * discount;
	}
}
