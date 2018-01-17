package Chapter3;

import java.util.Scanner;

/**
 * Program that decides if an integer is divisible by 5 and 6, 5 or 6, or 5 or
 * 6, but not both.
 *
 * @author Garrett Bolding
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        double integer = input.nextDouble();

        if (integer % 5 == 0 && integer % 6 == 0) {
            System.out.println("Is " + integer + " divisible by 5 and 6?: true");
        } else {
            System.out.println("Is " + integer + " divisible by 5 and 6?: false");
        }

        if (integer % 5 == 0 || integer % 6 == 0) {
            System.out.println("Is " + integer + " divisible by 5 or 6?: true");
        } else {
            System.out.println("Is " + integer + " divisible by 5 or 6?: false");
        }

        if (integer % 5 == 0 ^ integer % 6 == 0) {
            System.out.println("Is " + integer + " divisible by 5 or 6, but not both?: true");
        } else {
            System.out.println("Is " + integer + " divisible by 5 or 6, but not both?: false");
        }
    }
}
