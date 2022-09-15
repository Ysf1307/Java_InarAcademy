package chapters.chapter_05;

import java.util.Scanner;

public class Q_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Loan Amount:");
        double loanAmount = input.nextDouble();
        System.out.println("Number of years:");
        int numberOfYears = input.nextInt();

        double monthlyPayment = 0;
        double totalPayment = 0;
        double annualInterestRate = 0;
        double monthlyInterestRate = 0;
        String output = "Interest Rate\tMonthly Payment\tTotal Payment";

        for (annualInterestRate = 5.0; annualInterestRate <= 8.0; annualInterestRate += 0.125){
            monthlyInterestRate = annualInterestRate / 1200;
            monthlyPayment = loanAmount * monthlyInterestRate
                    / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            totalPayment = monthlyPayment * numberOfYears * 12;
            output += "\n" + annualInterestRate + "\t\t" + monthlyPayment + "\t\t" + totalPayment;
        }
        System.out.println(output);

    }
}
