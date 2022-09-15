package chapters.chapter_05;

import java.util.Scanner;

public class Q_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the initial deposit amount:");
        double amount = input.nextDouble();
        System.out.println("Enter annual percentage yield:");
        double annualPercentage = input.nextDouble();
        System.out.println("Enter maturity period (number of months):");
        int numberOfMonths = input.nextInt();

        double monthlyRate = annualPercentage / 1200;
        double total = amount;
        String output = "";

        for (int i = 1; i <= numberOfMonths; i++){
            total = total + total * monthlyRate;
            output += i + "\t\t" + total + "\n";
        }
        System.out.println("Month\tCD Value");
        System.out.println(output);
    }
}
