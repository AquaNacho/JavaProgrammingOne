package Chapter2;

import java.util.Scanner;

/**
 * Program to read subtotal and tip rate and output the amount you need to tip
 * along with what the entire total will be
 *
 * @author Garrett Bolding
 */

public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the subtotal and gratuity rate?: ");

        double subTotal = input.nextDouble();
        double tip = input.nextDouble();
        double gratuity = subTotal * tip / 100;
        double total = subTotal * (1.0 + tip / 100);

        System.out.print("\nYour gratuity is $"
                + gratuity + " and your total is $" + total);
    }
}
