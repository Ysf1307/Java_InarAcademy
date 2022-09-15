package chapters.chapter_05;

import java.util.Scanner;

public class Q_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount:");
        double amount = input.nextDouble();
        System.out.println("Enter the annual interest rate:");
        double annualInterestRate = input.nextDouble();
        System.out.println("Enter the number of months:");
        int numberOfMonths = input.nextInt();

        double interest = annualInterestRate / 1200;
        double total = 0;

        for (int i = 0;i < numberOfMonths; i++){
            total = (amount + total) * (1 + interest);
        }

        System.out.println("Total amount for " + numberOfMonths + " months is " + total);
    }
}
