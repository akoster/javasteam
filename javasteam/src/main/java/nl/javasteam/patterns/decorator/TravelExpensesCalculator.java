package nl.javasteam.patterns.decorator;

/**
 * Calculator which adds travel expenses
 * 
 * @author Adriaan
 */
public class TravelExpensesCalculator implements Calculator {

	private double travelExpenses;
	private Calculator calculator;

	/**
	 * Creates an instance which calculates travel expenses based on the
	 * kilometers travelled by car and the rate per kilometer
	 * 
	 * @param carKilometers
	 * @param kilometerRateEuroCents
	 * @param calculator
	 */
	public TravelExpensesCalculator(int carKilometers,
			double kilometerRateEuroCents, Calculator calculator) {
		this.calculator = calculator;
		travelExpenses = carKilometers * kilometerRateEuroCents;
	}

	/**
	 * Creates an instance which adds public transport travel expenses
	 * 
	 * @param publicTransportExpenses
	 * @param calculator
	 */
	public TravelExpensesCalculator(double publicTransportExpenses,
			Calculator calculator) {

		this.calculator = calculator;
		travelExpenses = publicTransportExpenses;
	}

	public double calculate(int hours) {
		return calculator.calculate(hours) + travelExpenses;
	}

}
