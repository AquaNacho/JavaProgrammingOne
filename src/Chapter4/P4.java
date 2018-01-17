package Chapter4;

import java.util.Scanner;

/**
 * Program that reads two bidders on a job and compares the hours needed and the
 * charge per hour and determines which bidder has the better deal, and
 * identifies if their bids are the same
 *
 * @author Garrett Bolding
 */

public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter the name of the first bidder: ");
        System.out.println("How many hours of work are required?: ");
        System.out.println("How much does the first bidder charge per hour?: ");
        Scanner input = new Scanner(System.in);
        String firstBidder = input.next();
        int firstHours = input.nextInt();
        double firstRate = input.nextDouble();
        System.out.println("Enter the name of the second bidder: ");
        System.out.println("How many hours of work are required?: ");
        System.out.println("How much does the second bidder charge per hour?: ");
        String secondBidder = input.next();
        int secondHours = input.nextInt();
        double secondRate = input.nextDouble();

        double firstHourCost = firstHours * firstRate;
        System.out.println("The total cost for the first bidder is $"
                + firstHourCost);
        double secondHourCost = secondHours * secondRate;
        System.out.println("The total cost for the second bidder is $"
                + secondHourCost);

        if (firstHourCost < secondHourCost) {
            System.out.printf("\nThe winner is %s, with a total cost of $%.2f ",
                    firstBidder, firstHourCost);
        }
        if (secondHourCost < firstHourCost) {
            System.out.printf("\nThe winnder is %s, with a total cost of $%.2f ",
                    secondBidder, secondHourCost);
        }
        if (firstHourCost == secondHourCost && firstHours < secondHours) {
            System.out.printf("\nThe winner is %s, with a total cost of $%.2f "
                    + "and a total of %d hours.", firstBidder, firstHourCost,
                    firstHours);
        }
        if (firstHourCost == secondHourCost && secondHours < firstHours) {
            System.out.printf("\nThe winner is %s, with a total cost of $%.2f "
                    + "and a tota of %d hours.", secondBidder,
                    secondHourCost, secondHours);
        }
        if (firstHourCost == secondHourCost && firstHours == secondHours) {
            System.out.printf("\n%s and %s have identical bids. The hours "
                    + "required are %d and the total cost is"
                    + " $%.2f at $%.2f per hour.", firstBidder, secondBidder, firstHours,
                    firstHourCost, firstRate);
        }
    }
}
