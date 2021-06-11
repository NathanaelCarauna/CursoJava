package Util;

public class CurrencyConverter {
	public static double converter(double price, double amount) {
		double result = price * amount;
		return result + result *0.06;
	}
}
