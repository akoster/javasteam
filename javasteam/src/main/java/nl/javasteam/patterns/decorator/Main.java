package nl.javasteam.patterns.decorator;

public class Main {

	public static void main(String[] args) {

		int workedHours = 11;
		int rateEuros = 90;
		int carKilometers = 34;
		int kilometerRateEuroCents = 19;

		Calculator calculator = new VatCalculator(new TravelExpensesCalculator(
				carKilometers, kilometerRateEuroCents, new DiscountCalculator(
						new FeeCalculator(rateEuros))));
		System.out.println(calculator.calculate(workedHours));
	}
}
