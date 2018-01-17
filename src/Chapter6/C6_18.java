package Chapter6;

import java.util.Scanner;

/**
 * Program that determines if a password applied to a set of rules
 *
 * @author Garrett Bolding
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter a password:");
        Scanner input = new Scanner(System.in);
        String password = input.next();

        if (isValid(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

    /**
     * Password Verifier
     *
     * @param password the password the user enters
     * @return if it is true or false (passes or doesn't)
     */
    public static boolean isValid(String password) {
        int counter = 0;
        // 8 characters
        if (password.length() < 8) {
            return false;
        }
        // digits and numbers
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i)));
            return false;
        }
        // atleast 2 digits
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++counter;
            }

        }
        if (counter < 2) {
            return false;
        }
        return true;
    }
}
