package Chapter5;

import java.util.Scanner;

/**
 * Program to play rock, paper, and scissors game
 *
 * @author Garrett Bolding
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int win = 0;
        int lose = 0;
        Scanner input = new Scanner(System.in);
        int Com = (int) (Math.random() * 4);
        do {
            System.out.print("Let's play rock, paper, scissors 0 for Rock,"
                    + " 1 for paper, and 2 for scissors\n");
            int playerGuess = input.nextInt();
            int CompGuess = (int) (Math.random() * 3);
            switch (playerGuess) {
                case 0:
                    if (CompGuess == 0) {
                        System.out.println("It's a tie");
                    } else if (CompGuess == 1) {
                        System.out.println("You lost");
                        lose++;
                    } else if (CompGuess == 2) {
                        System.out.println("You won");
                        win++;

                    }
                    break;
                case 1:
                    if (CompGuess == 0) {
                        System.out.println("You won");
                        win++;
                    } else if (CompGuess == 1) {
                        System.out.println("It's a tie");
                        lose++;
                    } else if (CompGuess == 2) {
                        System.out.println("You lost");

                    }
                    break;
                case 2:
                    if (CompGuess == 0) {
                        System.out.println("You lost");
                    } else if (CompGuess == 1) {
                        System.out.println("You won");
                        lose++;
                    } else if (CompGuess == 2) {
                        System.out.println("It's a Tie");

                    }
                    break;
            }

        } while (win <= 2 && lose <= 2);
    }
}
