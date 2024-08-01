package util;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double usdToBrl(double dollarPrice, double dollarAmount){
        double realTotal = dollarPrice * dollarAmount;
        return realTotal += realTotal * IOF;
    }
}
