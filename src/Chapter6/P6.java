package Chapter6;

import java.util.Scanner;

/**
 * Program that converts from dollars to another currency
 *
 * @author Garrett Bolding
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //declare all constants
        System.out.println("How many Euros will a US Dollar buy? ");
        Scanner input = new Scanner(System.in);
        final double EURO = input.nextDouble();
        System.out.println("How many Pound Sterling will a US Dollar buy? ");
        final double POUND_STERLING = input.nextDouble();
        System.out.println("How many Yen will a US Dollar buy? ");
        final double YEN = input.nextDouble();

        double dollars = 0;
        String response = "";
        //begin loop
        do {
            System.out.println("Enter the number of dollars: ");
            dollars = input.nextDouble();
            System.out.println("Enter \"E\" for Euros, \"P\" for Pound Sterling,"
                    + " or \"Y\" for Yen");
            String choice = input.next().toLowerCase();

            switch (choice) {
                case "e":
                    double e = danny(dollars, EURO);
                    break;
                case "p":
                    double p = danny(dollars, POUND_STERLING);
                    break;
                case "y":
                    double y = danny(dollars, YEN);
                    break;

            }
            ///do you want to make more conversions
            do {
                System.out.println("Are there more conversions to perfom?");
                response = input.next().toLowerCase();
            } while (!response.equals("no") && !response.equals("yes"));

            //response
        } while (!response.equals("no"));

    }

    /**
     * Currency Exchange Equation
     *
     * @param dollars the amount of dollars we are converting
     * @param exchangeRate the currency rate that we are exchanging
     * @return The amount of currency that the dollars are equal to
     */
    public static double danny(double dollars, double exchangeRate) {
        double currencyChangeOverHundred = .95 * dollars * exchangeRate;
        double currencyChangeUnderHundred = .90 * dollars * exchangeRate;
        if (dollars > 100) {
            System.out.printf("$" + dollars + " will give you $%4.2f "
                    + "in the chosen currency.", currencyChangeOverHundred);
            return currencyChangeOverHundred;
        } else {
            System.out.printf("$" + dollars + " will give you $%4.2f "
                    + "in the chosen currency.", currencyChangeUnderHundred);
            return currencyChangeUnderHundred;
        }

    }
}
