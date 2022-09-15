package chapters.chapter_05;

import java.util.Scanner;

public class Q_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Loan Amount:");
        double loanAmount = input.nextDouble();
        System.out.println("Number of Years:");
        int numberOfYears = input.nextInt();
        System.out.println("Annual Interest Rate:");
        double annualInterestRate = input.nextDouble();


        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        double balance = loanAmount;
        double interest = 0;
        double principal = 0;
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);

        String output = "\nPayment#\tInterest\t\t\tPrincipal\t\t\t" +
                "Balance\n";

        for (int i = 1; i <= numberOfYears * 12; i++){
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            output +="\n\t" + i + "\t\t" + interest + "\t" + principal + "\t" + balance;
        }
        System.out.println(output);


    }
}
