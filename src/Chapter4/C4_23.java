package Chapter4;

import java.util.Scanner;

/**
 * Program that reads an employee's name and work information and outputs their
 * pay along with federal and state deductions, then eventually their net pay.
 *
 *
 * @author Garrett Bolding
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter employee's name: ");
        System.out.println("Enter number of hours worked in a week: ");
        System.out.println("Enter hourly pay rate: ");
        System.out.println("Enter federal tax withholding rate: ");
        System.out.println("Enter state tax withholding rate: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        double hour = input.nextDouble();
        double hourrate = input.nextDouble();
        double fedtax = input.nextDouble();
        double statetax = input.nextDouble();
        System.out.printf("Employee name: %s", name);
        System.out.printf("\nHours Worked: %.2f", hour);
        System.out.printf("\nPay Rate: $%.2f", hourrate);
        System.out.printf("\nGross Pay: $%.2f", (hourrate * hour));
        System.out.print("\nDeductions:");
        double grosspay = hourrate * hour;
        double fedwithhold = grosspay * fedtax;
        double statewithhold = grosspay * statetax;
        System.out.printf("\n\tFederal Withholding (%.2f%%):$%.2f\n", fedtax * 100, fedwithhold);
        System.out.printf("\tState Deduction (%.2f%%):$%.2f\n", statetax * 100, statewithhold);
        System.out.printf("\tTotal Deduction: $%.2f", fedwithhold + statewithhold);
        System.out.printf("\nNet Pay: $%.2f\n", grosspay - (fedwithhold + statewithhold));
    }
}
