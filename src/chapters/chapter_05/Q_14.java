package chapters.chapter_05;

import java.util.Scanner;

public class Q_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = input.nextInt();
        System.out.println("Enter second number:");
        int number2 = input.nextInt();
        int divisor = 0;
        if (number1 < number2){
            divisor = number1;
        }
        else {
            divisor = number2;
        }

        while (divisor > 0){
            if (number1 % divisor == 0 && number2 % divisor == 0){
                break;
            }
            divisor--;
        }
        System.out.println("The geatest common divisor is " + divisor);

    }
}
