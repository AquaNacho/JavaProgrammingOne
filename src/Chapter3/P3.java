package Chapter3;

import java.util.Scanner;

/**
 * Program that compares two integers in multiple ways in terms of numerical
 * relation to each other
 *
 * @author Garrett Bolding
 */

public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter your second number: ");
        num2 = input.nextDouble();

        System.out.print("\n");

        if (num1 < num2) {
            System.out.println("The first number is less than the second.");
        }
        if (num1 > num2) {
            System.out.println("The first number is greater than the second.");
        }
        if (num1 == num2) {
            System.out.println("The first number is equal to the second.");
        }
        if (num1 <= num2) {
            System.out.println("The first number is less then or equal to the"
                    + " second.");
        }
        if (num1 != num2) {
            System.out.println("The first number is not equal to the second");
        }
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else if ((num1 / num2) < 1) {
            System.out.println("Proper Fraction");
        } else {
            System.out.println("Improper Fraction");
        }

        if (num1 >= 90) {
            System.out.println("A");
        } else if (num1 >= 80) {
            System.out.println("B");
        } else if (num1 >= 70) {
            System.out.println("C");
        } else if (num1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (num2 >= 1 && num2 <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
