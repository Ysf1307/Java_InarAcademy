package chapters.chapter_06;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int years = 30;
        double total = 0;

        System.out.println("Enter the Invest Amount:");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter the Interest Rate:");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate = monthlyInterestRate / 1200;

        System.out.println("Years\tFuture Value");

        for (int i = 1; i <= years; i++) {
            total = futureInvestmentValue(investmentAmount, monthlyInterestRate, 1);
            System.out.println(i + "\t\t" + total);
            investmentAmount = total;
        }
    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {

        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));

        return futureInvestmentValue;
    }

}
