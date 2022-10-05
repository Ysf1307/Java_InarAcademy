package chapters.chapter_06;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = input.nextInt();
        int total = sumDigits(number);
        System.out.println("Sum of digits is " + total);

    }
    public static int sumDigits(long n){
        int sum = 0;

        while (n != 0){
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }
}
