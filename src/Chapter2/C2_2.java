package Chapter2;

import java.util.Scanner;

/**
 * Program to read the radius and length and output the area and volume
 *
 * @author Garrett Bolding
 */

public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius and length of a cylinder?: ");

        final double PI = 3.14;
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("\nThe area is " + area);
        System.out.println("The volume is " + volume);
    }
}
