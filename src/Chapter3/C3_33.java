package Chapter3;

import java.util.Scanner;

/**
 * Program that decides if the first or second package has a better value,
 * depending on weight and price.
 *
 * @author Garrett Bolding
 */

public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Wieght and Price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.println("Enter the Weight and Price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        if ((price1 / weight1) > (price2 / weight2)) {
            System.out.print("Package 2 has a better price.");
        } else {
            System.out.print("Package 1 has a better price.");
        }
    }
}
