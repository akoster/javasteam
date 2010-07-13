package nl.javasteam.patterns.decorator;

public class DiscountCalculator implements Calculator {

	private Calculator calculator;
	private double discount = 0.1;

	public DiscountCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public double calculate(int hours) {
		return calculator.calculate(hours) * discount;
	}

	/**
	 * @param discountPercentage
	 * @throws IllegalArgumentException if discount percentage is more than 100
	 */
	public Calculator setDiscount(double discountPercentage) {
		// Throw exception is discount percentage is more than 100
		if(discountPercentage > 100){
			throw new IllegalArgumentException("Discount percentage cannot be larger than 100");
		}
		// TODO: check for negative discounts
		this.discount = 1.0 - (discountPercentage / 100);
		return this;
	}
}
