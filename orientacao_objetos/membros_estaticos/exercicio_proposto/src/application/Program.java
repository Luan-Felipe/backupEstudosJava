package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userEnter = new Scanner(System.in);
        double dollarPrice, dollarAmount;

        System.out.print("What is the dollar price? ");
        dollarPrice = userEnter.nextDouble();

        System.out.print("How many dollars will be bought? ");
        dollarAmount = userEnter.nextDouble();

        double reaisAmount = CurrencyConverter.usdToBrl(dollarPrice, dollarAmount);
        System.out.printf("Amount to be paid in reais = %.2f", reaisAmount);
    }
}