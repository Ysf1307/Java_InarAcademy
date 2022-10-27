package chapters.chapter_07;

import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter five numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Greatest Common Divisor: " + gcd(numbers));
    }


    public static int gcd(int[] numbers) {
        int minElementOfNumbers = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minElementOfNumbers) {
                minElementOfNumbers = numbers[i];
            }
        }

        int greatestCommonDivisor = minElementOfNumbers;

        for (greatestCommonDivisor = minElementOfNumbers; greatestCommonDivisor > 0; greatestCommonDivisor--) {
            int divideCount = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] % greatestCommonDivisor == 0) {
                    divideCount++;
                }
            }
            if (divideCount == 5) {
                break;
            }
        }
        return greatestCommonDivisor;
    }
}
