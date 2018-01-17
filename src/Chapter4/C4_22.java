package Chapter4;

import java.util.Scanner;

/**
 * Program that compares two strings to determine if s1 is a substring of s2
 *
 *
 * @author Garrett Bolding
 */

public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter string s1: " + "\nEnter string s2: ");
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();

        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
