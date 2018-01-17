package Chapter2;

import java.util.Scanner;

/**
 * Program to read a degree in celsius and output that value in fahrenheit
 *
 * @author Garrett Bolding
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your temperature in celsius?: ");

        double celsius = input.nextDouble();
        double fahrenheit = 9.0 / 5 * celsius + 32;

        System.out.println("\nYour temperature of " + celsius + " is "
                + fahrenheit + "in fahrenheit");
    }
}
