package nl.javasteam.patterns.decorator;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new VatCalculator(new DiscountCalculator(new FeeCalculator(90))).setVatPercentage(16);
		System.out.println(calculator.calculate(11));
	}
}
