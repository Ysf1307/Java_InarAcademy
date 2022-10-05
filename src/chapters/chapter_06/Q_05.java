package chapters.chapter_06;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1:");
        double number1 = input.nextDouble();
        System.out.println("Enter number 2:");
        double number2 = input.nextDouble();
        System.out.println("Enter number 3:");
        double number3 = input.nextDouble();

        displaySortedNumbers(number1, number2, number3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        if (num1 > num2 && num1 > num3 && num2 > num3){
            System.out.println("Number in increasing order: " + num1 + "\t" + num2 + "\t" + num3);
        }
        else if (num1 > num2 && num1 > num3 && num3 > num2){
            System.out.println("Number in increasing order: " + num1 + "\t" + num3 + "\t" + num2);
        }
        else if (num2 > num1 && num2 > num3 && num1 > num3){
            System.out.println("Number in increasing order: " + num2 + "\t" + num1 + "\t" + num3);
        }
        else if (num2 > num1 && num2 > num3 && num3 > num1){
            System.out.println("Number in increasing order: " + num2 + "\t" + num3 + "\t" + num1);
        }
        else if (num3 > num1 && num3 > num2 && num1 > num2){
            System.out.println("Number in increasing order: " + num3 + "\t" + num1 + "\t" + num2);
        }
        else if (num3 > num1 && num3 > num2 && num2 > num1){
            System.out.println("Number in increasing order: " + num3 + "\t" + num2 + "\t" + num1);
        }
    }
}
