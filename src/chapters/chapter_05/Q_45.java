package chapters.chapter_05;

import java.util.Scanner;
public class Q_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number = 0;
        double sum = 0;
        double powSum = 0;
        int n = 10;

        for (int i = 0;i < n; i++){
            System.out.println("Enter number " + (i+1) + " :");
            number = input.nextDouble();
            sum += number;
            powSum += Math.pow(number, 2);
        }

        double mean = sum / n;
        double deviation = Math.sqrt((powSum - (Math.pow(sum,2)/n)) / (n-1));

        System.out.println("\nThe mean is " + mean);
        System.out.println("The standart deviation is " + String.format("%.5f",deviation));
    }
}
