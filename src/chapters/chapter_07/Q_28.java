package chapters.chapter_07;

import java.util.Scanner;

public class Q_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter ten integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i] + "" + numbers[j] + " ");
            }
            System.out.println();
        }
    }
}
