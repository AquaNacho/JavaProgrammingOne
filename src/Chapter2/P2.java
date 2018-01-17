package Chapter2;

import java.util.Scanner;

/**
 * Program to read the value of all your food at a restaurant and calculate the
 * total with tax and a tip.
 *
 * @author Garrett Bolding
 */

public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        double totalPrice = 0.0;
        final double SALES_TAX = 1.10;
        double totalPriceWithTax = 0.0;
        final double TIP = 1.15;
        double totalPriceWithTip = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of your meal: ");
        double meal = input.nextDouble();

        System.out.print("Enter the price of your drink: ");
        double drink = input.nextDouble();

        System.out.print("Enter the price of your dessert: ");
        double dessert = input.nextDouble();

        totalPrice = (meal + drink + dessert);
        System.out.printf("\nThe total price of your food is: $%4.2f\n",
                +totalPrice);

        totalPriceWithTax = totalPrice * SALES_TAX;
        System.out.printf("The total tax for your meal is: $%4.2f\n",
                +(totalPriceWithTax - totalPrice));

        totalPriceWithTip = totalPriceWithTax * TIP;
        System.out.printf("Your calculated tip is: $%4.2f\n",
                +(totalPriceWithTip - totalPriceWithTax));

        System.out.printf("Your total cost including food, tax, and tip is:"
                + "$%4.2f\n",
                +totalPriceWithTip);
    }
}
