package Chapter3;

import java.util.Scanner;

/**
 * Program to play heads or tails by guessing and the game telling you if you
 * were correct or not
 *
 * @author Garrett Bolding
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int coin = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess heads or tails: Enter 1 for heads or 0 for "
                + "tails.");

        int guess = input.nextInt();

        String coinAnswer = (coin == 0) ? "tails" : "heads";

        System.out.print("The coin landed on ");
        if (guess == coin) {
            System.out.print(coinAnswer + ". You were right!");
        } else {
            System.out.print(coinAnswer + ". Nice try, but you failed!");
        }

    }
}
