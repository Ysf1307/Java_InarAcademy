package chapters.chapter_07;

import java.util.Scanner;

public class Q_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] eliminatedArray = new int[10];
        eliminatedArray = eliminateDuplicates(numbers);

        for (int i = 0; i < eliminatedArray.length-1; i++) {
            if (eliminatedArray[i] + eliminatedArray[i + 1] != 0) {
                System.out.print(eliminatedArray[i] + " ");
            }
        }
    }

    public static int[] eliminateDuplicates(int[] numbers) {
        int[] newList = new int[10];
        int index = 0;

        newList[index] = numbers[0];
        index++;

        for (int i = 1; i < numbers.length; i++) {
            boolean isHave = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == newList[j]) {
                    isHave = true;
                }
            }
            if (!isHave) {
                newList[index] = numbers[i];
                index++;
            }

        }
        return newList;
    }
}
